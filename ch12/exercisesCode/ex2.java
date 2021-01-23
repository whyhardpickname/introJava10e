package exercisesCode;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/7 15:46
 */
public class ex2
{
    public static void main(String[] args)
    {
        System.out.print("enter two integers: ");
        Scanner in = new Scanner(System.in);
        try
        {
            int i = in.nextInt();
            int j = in.nextInt();
            System.out.println(i + " + " + j + " = " + (i + j));
        }
        catch (InputMismatchException e)
        {
            System.out.print("wrong input");
            System.out.print("enter two integers: ");
        }
    }
}
