class ekClass{
    int a;

    public int getA() {
        return a;
    }

    ekClass(int v){
        this.a = v;
    }

    public int returnOne(){
        return 1;
    }
}

class doClass extends ekClass{
    doClass(int c){
        super(c);
        System.out.println("I am a constructor (doClass)");
    }
}

public class java_47_this_super {
    public static void main(String[] args) {
        ekClass e = new ekClass(5);
        doClass d = new doClass(10);
        System.out.println(e.getA());
    }
}
