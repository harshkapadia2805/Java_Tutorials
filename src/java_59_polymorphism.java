interface camera2{
    void takeShot();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4K(){
        greet();
        System.out.println("recording 4K");
    }
}

interface wifi2{
    String[] getNetworks();
    void connectToNetworks(String network);
}

class myCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling... "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}

class MySmartPhone2 extends myCellPhone implements camera2, wifi2{
    public void takeShot(){
        System.out.println("taking shot");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    public String[] getNetworks(){
        System.out.println("getting list of networks");
        String[] networkList = {"harsh","kapadia"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("connecting to..."+ network);
    }
//    @Override
//    public void record4K(){
//        System.out.println("snap and 4K");
//    }
}

public class java_59_polymorphism {
    public static void main(String[] args) {
        camera2 cam = new MySmartPhone2();   //smartphone but used as camera
//        cam.getNetworks();            not allowed
        cam.record4K();
    }
}
