class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}

class SmartPhone extends Phone{
    public void welcome(){
        System.out.println("Welcome");
    }
    public void on(){
        System.out.println("Turning on SmartPhone");    }
}

public class java_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.name();

        Phone obj = new SmartPhone();
//        SmartPhone obj = new Phone();    // not allowed

        obj.greet();
        obj.on();
//        obj.welcome();        // not allowed

    }
}
