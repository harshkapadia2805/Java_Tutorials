class prac13 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<100){
            System.out.println("good morning");
            i++;
        }
    }
}

class prac13b extends Thread{
//    @Override
//    public void run() {
//        int i=0;
//        while (i<100){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("welcome");
//            i++;
//        }
//    }
}

public class java_76_ps {
    public static void main(String[] args) {
        prac13 p1 = new prac13();
        prac13b p2 = new prac13b();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
