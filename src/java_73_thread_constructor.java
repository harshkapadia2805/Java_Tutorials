class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i<2){
            System.out.println("I am a thread");
            i++;
        }
    }
}

class mythr implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<3){
            System.out.println("I am a thread");
            i++;
        }
    }
}

public class java_73_thread_constructor {
    public static void main(String[] args) {
        //MyThr t1 = new MyThr("harsh");
        //MyThr t2 = new MyThr("harsh kapadia");
        //t1.start();
        //t2.start();
        //System.out.println("The ID of the thread is : "+ t1.getId());
        //System.out.println("The Name of the thread is : "+ t1.getName());
        //System.out.println("The ID of the thread is : "+ t2.getId());
        //System.out.println("The Name of the thread is : "+ t2.getName());

        mythr t1 = new mythr();
        Thread th = new Thread(t1,"Harsh Kapadia");
        th.start();
        System.out.println("The ID of the thread is : "+ th.getId());
        System.out.println("The Name of the thread is : "+ th.getName());
    }
}
