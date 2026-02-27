package exercise_2;

/*     
Exercise 2.2
    This code intends to display date formats in American and European
*/
public class Date 
{
    public static void main(String args[])
    {
        System.out.println("Hello, world!");

        String day = "Friday";
        int date = 13;
        String month = "July ";
        int year = 2005;

        System.out.println("American format: ");
        System.out.println(day + ", " + date + "th " + month + year);
        System.out.println("European format: ");
        System.out.println(day + ", " + month + date + ", " + year + ".");

    }    
}