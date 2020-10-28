import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex16
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int addend1 = random.nextInt(100);
        int addend2 = random.nextInt(100);
        System.out.print("Waht is " + addend1 + " + " + addend2 + "? ");
        Scanner in = new Scanner(System.in);
        int input = 0;
        ArrayList<Integer> answers = new ArrayList<>();
        while ((input = in.nextInt()) != addend1 + addend2)
        {
            if (answers.contains(input))
            {
                System.out.println("You already entered " + input);
            }
            else
            {
                answers.add(input);
            }
            System.out.println("Wrong answer. Try again. ");
            System.out.print("Waht is " + addend1 + " + " + addend2 + "? ");
        }
        System.out.println("You got it!");
    }
}
