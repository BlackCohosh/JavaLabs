/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args){
    System.out.println("Ah, the Guesser... Hello there! \n What's your name?" );

    Scanner in = new Scanner(System.in);
    String nom = in.nextLine();
    System.out.println(nom + ", I'm thinking of a number between 1 & 100 \n Try to guess that number.");

    int guessCount = 0;
    Random rand = new Random();
    int myNum = rand.nextInt(100);
    System.out.println(myNum);
    System.out.println("Your guess?");
    int guess = Integer.parseInt(in.nextLine());
    while (guess != myNum) {
    if (guess < myNum) {
      guessCount = guessCount + 1;
      System.out.println("Your guess was too low. Try again");
      guess = Integer.parseInt(in.nextLine());
    } else if (guess > myNum) {
      guessCount = guessCount + 1;
      System.out.println("Your guess is too high. Try again.");
      guess = Integer.parseInt(in.nextLine());
    }
    }
    if (guess == myNum){
      guessCount = guessCount + 1;
      System.out.println("Well done, " + nom + "! You found my number in " + guessCount + " tries!");
    }
  }
}
