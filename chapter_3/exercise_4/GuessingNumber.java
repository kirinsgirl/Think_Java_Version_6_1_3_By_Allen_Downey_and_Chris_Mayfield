/*
    This code aims to create a "Guess My Number" game
*/


package chapter_3.exercise_4;
import java.util.Scanner;
import java.util.Random;

public class GuessingNumber 
{
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
        System.out.println("The number I was thinking of is: " + randomNumber);

        int off;
        off = inputNumber - randomNumber;
        System.out.println("You were off by: " + off);
    }
}

