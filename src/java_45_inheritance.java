class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("In a base class and setting x");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a Constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class java_45_inheritance {
    public static void main(String[] args) {

        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        b.printMe();

        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
        d.printMe();
    }
}
