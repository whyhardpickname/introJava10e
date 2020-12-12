package ex14;

import java.util.Random;

/**
 * @author MarkChern
 * date 2020/12/12 17:05
 */
public class Rational
{
    private long[] r = new long[2];

    public Rational(long[] r)
    {
        this.r = r;
    }

    public Rational(long numerator, long denominator)
    {
        r[0] = numerator;
        r[1] = denominator;
    }

    private long gcd(long a, long b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a - b);
    }
}
