/*
    This code aims to convert seconds to hours, minutes, and seconds
*/

package chapter_3.exercise_3;
import java.util.Scanner;

public class ConvertingTime
{
    public static void main(String[] args)
    {
        int inputSeconds, hours; 
        int minutes, seconds;
        int remainingSc;

        Scanner in = new Scanner (System.in);
        System.out.print("Enter seconds: ");
        inputSeconds = in.nextInt();

        hours = inputSeconds  / 3600;
        remainingSc = inputSeconds % 3600;
        minutes = remainingSc / 60;
        seconds = remainingSc % 60;

        System.out.println(inputSeconds + " seconds = " +
        hours + " hours, " + minutes + " minutes, " + 
        seconds + " seconds.");
    }
}