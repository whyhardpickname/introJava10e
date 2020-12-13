package ex15;

import ex14.Rational;

/**
 * @author MarkChern
 * date 2020/12/12 17:16
 */
public class RationalTest
{
    public static void main(String[] args)
    {
        ex14.Rational r1 = new ex14.Rational(1, 2);
        ex14.Rational r2 = new Rational(1, 3);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.add(r2));
        System.out.println(r1.subtract(r2));
        System.out.println(r1.multiply(r2));
        System.out.println(r1.divide(r2));
    }
}
