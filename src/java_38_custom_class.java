class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class java_38_custom_class {
    public static void main(String[] args) {
//        System.out.println("A");
        Employee e1 = new Employee();    // instantiating new object
        Employee e2 = new Employee();    // instantiating new object

        e1.id = 1;
        e1.name = "harsh";
        e1.salary = 10;

        e2.id = 2;
        e2.name = "john";
        e2.salary = 20;

        //System.out.println(e1.id);
        //System.out.println(e1.name);
        e1.printDetails();
        e2.printDetails();

        int salary = e2.getSalary();
        System.out.println(salary);
    }
}
