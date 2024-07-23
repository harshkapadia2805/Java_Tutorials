class circle1 {
    public int radius;

    circle1(int r) {
        System.out.println("Circle parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends circle1 {
    public int height;

    Cylinder1(int r, int h) {
        super(r);
        System.out.println("Cylinder parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * height;
    }
}

public class java_52_ps {
    public static void main(String[] args) {
//        circle1 objC = new circle1(12);
        Cylinder1 obj = new Cylinder1(12, 4);
    }
}
