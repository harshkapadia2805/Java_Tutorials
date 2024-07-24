interface Bicycle{
    int a=45;                                                           // cant modify
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Bicycle1{
    void wheel();
    void stop();
}

class hercu implements Bicycle, Bicycle1{
    int speed = 7;
    void blow(){
        System.out.println("pooo");
    }
    public void applyBrake(int decrement){
        System.out.println("brake");
    }
    public void speedUp(int increment){
        System.out.println("speed");
    }
    public void wheel(){
        System.out.println("wheel");
    }
    public void stop(){
        System.out.println("stop");
    }
}

public class java_54_interface {
    public static void main(String[] args) {
        hercu h = new hercu();
//        h.applyBrake(1);
//        System.out.println(h.a);
        h.blow();
        h.applyBrake(1);
        h.speedUp(1);
        h.wheel();
        h.stop();
    }
}