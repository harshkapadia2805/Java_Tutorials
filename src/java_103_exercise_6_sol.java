class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "max input reached";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxMultiplyInputException extends Exception{
    @Override
    public String toString() {
        return "max multiply reached";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class CustomCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }else if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class java_103_exercise_6_sol {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException{
        CustomCalculator c = new CustomCalculator();
//        c.add(1,2);
//        c.add(8,9);
//        c.divide(3,0);
//        c.add(100002,100004);
        c.multiply(7001,7002);
    }
}
