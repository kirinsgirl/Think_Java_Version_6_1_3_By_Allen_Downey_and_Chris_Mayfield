package exercise_3;

public class Time 
{
    public static void main(String args[])    
    {
        int hour = 1;
        int minute = 47;
        int second = 50;
        int total_second = (hour * 3600) + (minute * 60) + second;
        System.out.println("Total seconds since midnight: " + total_second);

        double percentage = (total_second * 100) / (12 * 3600);
        System.out.println("Percentage of the day that has passed: " + percentage);

        int new_hour = 2;
        int new_minute = 58;
        int new_second = 30;
        int total_new_second = (new_hour * 3600) + (new_minute * 60) + new_second;
        int elapsed_time = total_new_second - total_second;
        System.out.println("Elapsed time since I started the exercise: " + elapsed_time);
    }
}
