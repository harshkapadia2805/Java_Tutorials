class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<50){
            System.out.println("My thread is running");
            System.out.println("I am happy!!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<50){
            System.out.println("Thread is good");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class java_70_multithreading_extend {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
