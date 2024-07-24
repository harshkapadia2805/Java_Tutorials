abstract class parent2{
    public parent2(){
        System.out.println("base2 constructor");
    }
    public void hello(){
        System.out.println("hello");
    }
    abstract public void greet();
}

class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("gm");
    }
}

abstract class child3 extends parent2{
    public void th(){
        System.out.println("good");
    }
}

public class java_53_abstract {
    public static void main(String[] args) {
//        parent2 p = new parent2();                            //not allowed
        child2 c = new child2();
        parent2 p = new child2();                           // dynamic method dispatch
    }
}
