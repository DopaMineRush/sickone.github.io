// Java program to find the area of the multiple shapes using Method Overloading
class Shape {

    void Area_sqr(int l) {
        int A = l * l;
        System.out.println("Area of the Square: " + A);
    }

    void Area_cir(double r) {
        double A = 3.14 * r * r;
        System.out.println("Area of the Circle: " + A);
    }

    void Area_rect(int l, int b) {
        int A = l * b;
        System.out.println("Area of the Rectangle: " + A);
    }

    void Area_tri(int l, int b, int h) {
        int A = l * b * h;
        System.out.println("Area of Triangle is: " + A);
    }
}

class ShapeArea {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.Area_sqr(10);
        obj.Area_cir(3);
        obj.Area_rect(5, 4);
        obj.Area_tri(12, 13, 15);
    }
}
