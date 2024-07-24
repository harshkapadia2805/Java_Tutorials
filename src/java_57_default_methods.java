interface camera{
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

interface wifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}

class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling... "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}

class MySmartPhone extends myCellPhone implements camera, wifi{
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

public class java_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone sm = new MySmartPhone();
        sm.record4K();
//        sm.greet();                                       //error
        String[] ar = sm.getNetworks();
        for(String item:ar){
            System.out.println(item);
        }
    }
}
