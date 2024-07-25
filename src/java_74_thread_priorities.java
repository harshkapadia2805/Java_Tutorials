class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("Thank you " + this.getName());
    }
}

public class java_74_thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("harsh1");
        MyThr1 t2 = new MyThr1("harsh2");
        MyThr1 t3 = new MyThr1("harsh3");
        MyThr1 t4 = new MyThr1("harsh4");
        MyThr1 t5 = new MyThr1("harsh5 (imp)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
