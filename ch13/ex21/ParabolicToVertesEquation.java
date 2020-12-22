package ex21;

import ex15.DecimalToFraction;
import ex15.Rational;

import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/12/22 16:38
 */
public class ParabolicToVertesEquation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a, b and c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        ex16.Rational h = new ex16.Rational(-1 * b, 2 *a);
        ex16.Rational k = new ex16.Rational(4 * a * c - b * b, 4 * a);

        System.out.println("h = " + h);
        System.out.println("k = " + k);

    }
}
