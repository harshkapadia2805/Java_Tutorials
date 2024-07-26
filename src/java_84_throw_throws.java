class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}


public class java_84_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        //made by me
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // user uses
        try {
            //int c = divide(6,0);
            //System.out.println(c);
            double d = area(-6);
            System.out.println(d);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
