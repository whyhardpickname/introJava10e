package ex15;

import java.math.BigInteger;

/**
 * @author MarkChern
 * date 2020/12/12 17:16
 */
public class RationalTest
{
    public static void main(String[] args)
    {
        Rational r1 = new Rational(BigInteger.valueOf(1), new BigInteger("2000000000000000000"));
        Rational r2 = new Rational(BigInteger.valueOf(1), new BigInteger("3000000000000000000"));
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.add(r2));
        System.out.println(r1.subtract(r2));
        System.out.println(r1.multiply(r2));
        System.out.println(r1.divide(r2));
    }
}
