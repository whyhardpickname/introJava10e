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
        int answer = 0;
        do
        {
            answer = in.nextInt();
            System.out.println("Wrong answer. Try again. ");
            System.out.print("Waht is " + addend1 + " + " + addend2 + "? ");
        }
        while (answer != addend1 + addend2);
    }
}
