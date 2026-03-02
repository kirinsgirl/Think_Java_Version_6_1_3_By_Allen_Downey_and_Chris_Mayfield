/*
    This code aims to convert Celcius degree to Fahrenheit degree
*/

package chapter_3.exercise_2;
import java.util.Scanner;

public class Temperature 
{
    public static void main(String[] args)
    {
        double celcius;
        double fahrenheit;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Celcius: ");
        celcius = in.nextDouble();

        double fahrenheit_converter = (celcius * 1.8) + 32;
        fahrenheit = fahrenheit_converter;
        System.out.println(celcius + " C" + " = " + fahrenheit + " F.");
    }
}

