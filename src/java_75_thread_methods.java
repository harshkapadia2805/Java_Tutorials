import java.lang.invoke.StringConcatException;
import java.sql.SQLOutput;

class MyNewThr1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<5){
            System.out.println("Thank you " + this.getId());
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<5){
            System.out.println("Thank you ");
            i++;
        }
    }
}

public class java_75_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
