package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2
{
    public static void main(String[] args)
    {
        boolean isInputOk = false;
        while (!isInputOk)
        {
            try
            {
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(a + " + " + b + " = " + (a + b));
            }
            catch (InputMismatchException e)
            {
                System.out.println("wrong input,please enter two integers.");
                isInputOk = false;
            }
        }

    }
}
