package ex14;

/**
 * @author MarkChern
 * date 2020/12/12 17:16
 */
public class RationalTest
{
    public static void main(String[] args)
    {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.add(r2));
        System.out.println(r1.subtract(r2));
        System.out.println(r1.multiply(r2));
        System.out.println(r1.divide(r2));
    }
}
