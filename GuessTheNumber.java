package All_Java_Codes;
import java.util.Scanner;
import java.util.Random;

class Game{
    public int Number;
    public int userInput;
    public int numberOfGuesses =0;

//    public int getNumberOfGuesses() {
//       return numberOfGuesses;
//    }
//
//    public void setNumberOfGuesses(int numberOfGuesses) {
//        this.numberOfGuesses = numberOfGuesses;
//    }
    Game(){
        Random Ran = new Random();
        Number = Ran.nextInt(100);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }
    boolean isCorrectNumber(){
        numberOfGuesses++;
        if(userInput == Number){
            System.out.println("You guessed the number");
            System.out.println("You guesses the Number in  " + numberOfGuesses + " attempt");
        }
        else if (userInput>Number){
            System.out.println("Too High");
        }
        else {
            System.out.println("Too Low");
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        System.out.println("Enter Your Choice");
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}
