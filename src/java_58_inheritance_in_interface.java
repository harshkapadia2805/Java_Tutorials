interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{
    public void meth3(){
        System.out.println("method 3");
    }
    public void meth4(){
        System.out.println("method 4");
    }
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");
    }

}

public class java_58_inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
