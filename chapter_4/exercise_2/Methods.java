package chapter_4.exercise_2;

public class Methods 
{
    public static  void zool(int number, String pet, String address)
    {
        System.out.println(number);
        System.out.println(pet);
        System.out.println(address);
    }

    public static void main(String[] args)
    {
        int number = 11;
        String pet = "Rock";
        String address = "123 Conch Street";

        zool(number, pet, address);
    }
}