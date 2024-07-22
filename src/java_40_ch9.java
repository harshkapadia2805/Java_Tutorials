class myEmployee{
    private int id;
    private String name;

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
}

public class java_40_ch9 {
    public static void main(String[] args) {
        System.out.println("L-40");

        myEmployee e1 = new myEmployee();
//        e1.id =45;
//        e1.name = "Harsh";

        e1.setName("Harsh");
        System.out.println(e1.getName());
        e1.setId(23);
        System.out.println(e1.getId());

    }
}
