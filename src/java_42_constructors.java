class myMainEmployee{
    private int id;
    private String name;
    private int salary;

    public myMainEmployee(int mySalary){
        id = 45;
        name = "Your-name";
        salary = mySalary;
    }

    public myMainEmployee(String myName, int myID){
        id = myID;
        name = myName;
    }

    public myMainEmployee(String myName){
        id = 67;
        name = myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){ return salary;}
    public void setSalary(int s){ this.salary = s;}
}

public class java_42_constructors {
    public static void main(String[] args) {
//        myMainEmployee e1 = new myMainEmployee("Your-Wish", 12);
//        myMainEmployee e1 = new myMainEmployee("Your-Wish");
        myMainEmployee e1 = new myMainEmployee(20000);

//        e1.setName("Harsh");
//        e1.setId(23);

        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
