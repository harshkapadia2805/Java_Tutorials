class Cylinder{
    private int r;
    private int h;

    public Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double surfaceArea(){
        return 2*3.14*r*r + 2*3.14*r*h;
    }

    public double volume(){
        return 3.14*r*r*h;
    }
}

class rectangle{
    private int l;
    private int b;

    public rectangle() {
        this.l = 4;
        this.b = 5;
    }

    public rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return l;
    }

    public int getB() {
        return b;
    }
}

public class java_44_ps {
    public static void main(String[] args) {

////        Cylinder c = new Cylinder();
//        Cylinder c = new Cylinder(9, 12);
//
////        c.setH(12);
//        System.out.println("Height : "+c.getH());
////        c.setR(9);
//        System.out.println("Radius : "+c.getR());
//
//
//        System.out.println("Surface Area : "+c.surfaceArea());
//        System.out.println("Volume : "+c.volume());

        rectangle r = new rectangle(10,12);
        System.out.println(r.getL());
        System.out.println(r.getB());

    }
}
