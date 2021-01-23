package exercisesCode;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ex3
{
    public static void main(String[] args)
    {
        int[] ints = new int[100];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = random.nextInt(100);
        }
        Scanner in = new Scanner(System.in);
        try
        {
            System.out.println(ints[in.nextInt()]);
        }
        catch (InputMismatchException exception)
        {
            System.out.println("wrong input.please enter a non-negative integer.");
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("index out of bounds");
        }
    }
}
