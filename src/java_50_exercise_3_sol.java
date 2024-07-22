import java.util.Random;
import java.util.Scanner;

class Game1{

    int number;
    int inputNumber;
    int noOfGuesses=0;

    Game1(){
        Random rand = new Random();
        number = rand.nextInt(100);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.println("won "+noOfGuesses);
            return true;
        }
        else if (inputNumber<number){
            System.out.println("too low...");
        }
        else if (inputNumber>number){
            System.out.println("too high");
        }
        return false;
    }
}

public class java_50_exercise_3_sol {
    public static void main(String[] args) {
        Game1 g = new Game1();
        boolean b=false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
