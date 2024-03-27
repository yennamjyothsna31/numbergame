import java.util.*;
import java.util.Random;

public class Numbergame{
public static void main(String args[]){
    Random rand=new Random();
    int numToGuess=rand.nextInt(100);
    int noOfTries=0;
    Scanner sc=new Scanner(System.in);
    int GuessedNum;
    boolean win=false;
    
    while(win==false){
        System.out.println("Guess a number between 1 and 100: ");
        GuessedNum=sc.nextInt();
        noOfTries++;
        
        if(GuessedNum==numToGuess){
            win=true;
        }
        else if(GuessedNum<numToGuess){
            System.out.println("Your guess is low");
        }
        else{
                        System.out.println("Your guess is high");
        }
    }
    System.out.println("You win!");
     System.out.println("The number was: " + numToGuess);
          System.out.println("It took you " + numToGuess + " tries");
}
}
