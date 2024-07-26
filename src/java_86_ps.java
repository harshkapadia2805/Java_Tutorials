import java.util.Scanner;

public class java_86_ps {
    public static void main(String[] args) {
        //problem1
        // syntax error   int a=7
        int age =78;
        int year_born=2000-78;    //logical error
//        System.out.println(6/0);  //runtime error


        //problem2
        try {
            int a=666/0 ;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }


        //problem3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.println("Enter index");
                index = sc.nextInt();
                System.out.println("value of marks[index] is "+ marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if (i>=5){
            System.out.println("Error");
        }
    }
}
