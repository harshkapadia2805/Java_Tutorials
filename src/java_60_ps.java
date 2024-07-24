abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("change nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    void speak(){
        System.out.println("speak");
    }
}

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone1 extends TelePhone{
    void call(){
        System.out.println("call");
    }

    @Override
    void ring() {
        System.out.println("ring");
    }

    @Override
    void lift() {
        System.out.println("lift");
    }

    @Override
    void disconnect() {
        System.out.println("disconnect");
    }
}

interface TVRemote{
    void channel();
    void volume();
}

interface SmartTVRemote extends TVRemote{
    void record();
    void youtube();
}

class sampleRemote implements SmartTVRemote{
    @Override
    public void record() {
        System.out.println("record");
    }

    @Override
    public void youtube() {
        System.out.println("youtube");
    }

    @Override
    public void channel() {
        System.out.println("channel");
    }

    @Override
    public void volume() {
        System.out.println("volume");
    }
}

class TV implements TVRemote{
    @Override
    public void channel() {
        System.out.println("channel");
    }

    @Override
    public void volume() {
        System.out.println("volume");
    }
}

public class java_60_ps {
    public static void main(String[] args) {
        //Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        //Q3
        human h = new human();
        h.sleep();

        //Q5
        Monkey m = new human();
        //m.speak();   cannot use speak method because the reference is monkey which does not have speak method
        m.jump();
        m.bite();

        BasicAnimal ba = new human();
        //ba.speak();
        ba.eat();
        ba.sleep();

        //Q4
        TelePhone tp = new SmartPhone1();
        //tp.call();
        tp.disconnect();
        tp.lift();
        tp.ring();

        //Q6
        sampleRemote sr = new sampleRemote();
        sr.channel();
        sr.volume();
        sr.record();
        sr.youtube();

        //Q7
        TV tv = new TV();
        tv.channel();
        tv.volume();


    }
}
