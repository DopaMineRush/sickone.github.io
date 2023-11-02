
// Java program to check Palindrome
import java.lang.String;
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        String str;
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        str = sc.nextLine();
        str = str.toUpperCase();
        System.out.println(str);
        n = str.length();
        char c[] = new char[n];
        char rev[] = new char[n];
        c = str.toCharArray();
        for (i = 0; i < n; i++) {
            rev[n - i - 1] = c[i];
        }
        for (i = 0; i < n; i++) {
            if (rev[i] != c[i])
                break;
        }
        if (n == i)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}