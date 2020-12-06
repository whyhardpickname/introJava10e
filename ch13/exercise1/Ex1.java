package exercise1;

import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/12/6 16:37
 */
public class Ex1
{
    public static void main(String[] args)
    {
        System.out.print("enter three sides of the triangle： ");
        Scanner read = new Scanner(System.in);
        int side1 = read.nextInt();
        int side2 = read.nextInt();
        int side3 = read.nextInt();
        System.out.print("enter color：");
        String color = read.next();
        System.out.println("enter true if the triangle is filled: ");
        boolean filled = read.nextBoolean();
        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println(triangle);
    }
}
