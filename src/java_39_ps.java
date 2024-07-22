class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class cellPhone{
    public void ring(){
        System.out.println("ringing");
    }

    public void vib(){
        System.out.println("vibrating");
    }
}

class square{
    int side;

    public int area(){
        return side*side;
    }

    public int peri(){
        return 4*side;
    }
}

class rect{
    int l;
    int b;

    public int area(){
        return l*b;
    }

    public int peri(){
        return l+l+b+b;
    }
}

class circle{
    int r;
    float pi = 3.14f;

    public float area(){
        return pi*r*r;
    }

    public float peri(){
        return 2*pi*r;
    }
}

public class java_39_ps {
    public static void main(String[] args) {
        System.out.println("L-39");

//        Employee1 e1 = new Employee1();
//        e1.setName("Harsh");
//        e1.salary = 200;
//        System.out.println(e1.getName());
//        System.out.println(e1.getSalary());

//        cellPhone cp = new cellPhone();
//        cp.ring();
//        cp.vib();

//        square s = new square();
//        s.side = 4;
//        System.out.println(s.area());
//        System.out.println(s.peri());

//        rect r = new rect();
//        r.l = 4;
//        r.b = 5;
//        System.out.println(r.area());
//        System.out.println(r.peri());

//        circle c = new circle();
//        c.r = 4;
//        System.out.println(c.area());
//        System.out.println(c.peri());
    }
}
