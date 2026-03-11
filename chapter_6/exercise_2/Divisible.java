package chapter_6.exercise_2;

public class Divisible 
{
    public static boolean isDivisible(int m, int n)    
    {
        if (m % n == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int m = 10; 
        int n = 2;

        boolean result = isDivisible(m, n);
        System.out.println(result);
    }
}

