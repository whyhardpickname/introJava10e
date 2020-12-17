package ex15;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/12/17 17:25
 */
public class DecimalToFraction
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a decimal number: ");
        String[] elements = input.next().split("\\.");
        BigInteger numerator = new BigInteger(elements[1]);
        BigInteger denominator = BigInteger.TEN.pow(elements[1].length());
        numerator = numerator.add(denominator.multiply(new BigInteger(elements[0])));
        System.out.println(new Rational(numerator, denominator));

    }
}
