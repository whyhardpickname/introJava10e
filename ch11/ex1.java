import java.util.Scanner;

public class ex1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter 3 side's length: ");
        int side1 = in.nextInt();
        int side2 = in.nextInt();
        int side3 = in.nextInt();
        System.out.println();

        System.out.print("enter the color: ");
        String color = in.next();
        System.out.println();

        System.out.print("enter the true if it if it is filled: ");
        boolean filled = in.nextBoolean();
        System.out.println();

        Triangle t = new Triangle(side1, side2, side3, color, filled);
        System.out.println(t);
    }
}
