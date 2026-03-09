package chapter_4.exercise_3;

public class Date2
{
     public static void printAmerican(String day, String month, String date, int year)
    {
        System.out.print(day);
        System.out.print(month);
        System.out.print(date);
        System.out.println(year);
    }
    
     public static void printEurope(String day, int date, String month, int year)
    {
        System.out.print(day);
        System.out.print(date);
        System.out.print(month);
        System.out.print(year);
    }
    
    public static void main(String[] args)
    {
        String dayUS = "Friday,";
        String monthUS = " July ";
        String dateUS = "13, ";
        int year = 2005;

        System.out.println("American format: ");
       printAmerican(dayUS, monthUS, dateUS, year);
       
       String dayEU = "Friday ";
       int dateEU = 13;
       String monthEU = " July ";
       
        System.out.println("European format: ");
        printEurope(dayEU, dateEU, monthEU, year);
    }    
}

