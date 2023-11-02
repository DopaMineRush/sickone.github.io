class Room {
    float length;
    float breadth;

    void getdata(float a, float b) {
        length = a;
        breadth = b;
    }

    void getdata(float a) {
        length = a;
    }

    public static void main(String args[]) {
        float area;
        Room r1 = new Room();
        Room r2 = new Room();
        r1.getdata(20, 10);
        r2.getdata(30);
        area = r1.length * r1.breadth;
        System.out.println("Area of Rectangle= " + area);
        area = r2.length * r2.length;
        System.out.println("Area of Square= " + area);
    }
}
