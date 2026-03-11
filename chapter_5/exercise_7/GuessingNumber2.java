package chapter_5.exercise_7;

import java.util.Scanner;
import java.util.Random;

public class GuessingNumber2 
{
    public static void guessedNumber(int randomNumber, int inputNumber)
    {

        if (inputNumber == randomNumber) {
            System.out.println("You're correct!");
            return;
        } else {
            if (inputNumber > randomNumber) {
                System.out.println("Too high.");
                
            } else {
                System.out.println("Too low.");
            }
        }
                System.out.print("Take another guess: ");
                Scanner in = new Scanner(System.in);
                inputNumber = in.nextInt();
                guessedNumber(randomNumber, inputNumber);
    }


    public static void main(String[] args)    
    {
        System.out.println("I'm thinking of a number between 1 and 100" +
        " (including both). Can you guess what is it?");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");

        int inputNumber;
        inputNumber = in.nextInt();
        System.out.println("Your guess is " + inputNumber);

        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt(100) + 1;

        guessedNumber(randomNumber, inputNumber);
    }
}
