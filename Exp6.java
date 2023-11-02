
// Java program for finding transpose matrix
import java.util.Scanner;

class Transpose {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of m and n:");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[n][m];
        System.out.println("Matrix A");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Enter a number:");
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.println("Transpose Matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
