class Base1{
    Base1(){
        System.out.println("I am a constructor (Base)");
    }
    Base1(int x){
        System.out.println("I am a overloaded constructor (Base) with value of x as: "+x);
    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("I am a constructor (Derived)");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a overloaded constructor (Derived) with value of y as: "+y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a constructor (Child of derived)");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructor (Child of Derived) with value of z as: "+z);
    }
}

public class java_46_constructors_in_inheritance {
    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(14,9);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(14,9,20);

    }
}
