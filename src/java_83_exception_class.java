import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age Cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that value entered is correct";
    }
}

public class java_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            try {
                //throw new MyException();
                //throw new ArithmeticException("This is exception");
                throw new MaxAgeException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                //System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
