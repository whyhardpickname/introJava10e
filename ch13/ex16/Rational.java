package ex16;

/**
 * @author MarkChern
 * date 2020/12/12 17:05
 */
public class Rational
{
    private long[] r = new long[2];

    public Rational()
    {
        r[0] = 0;
        r[1] = 1;
    }
    public Rational(long numerator, long denominator)
    {
        long gcd = gcd(numerator, denominator);
        r[0] = Math.abs(numerator) / gcd;
        r[1] = Math.abs(denominator / gcd);
    }

    private long gcd(long a, long b)
    {
        if (a % b == 0)
        {
            return b;
        }
        return gcd(b, a % b);
    }

    public long getNumerator()
    {
        return r[0];
    }

    public void setNumerator(long numerator)
    {
        r[0] = numerator;
    }

    public long getDenominator()
    {
        return r[1];
    }

    public void setDenominator(long denominator)
    {
        r[1] = denominator;
    }

    public Rational add(Rational other)
    {
        long denominator = r[1] * other.getDenominator();
        long numerator = r[0] * other.getDenominator() + r[1] * other.getNumerator();
        return new Rational(numerator, denominator);
    }

    public Rational subtract(Rational other)
    {
        long denominator = r[1] * other.getDenominator();
        long numerator = r[0] * other.getDenominator() - r[1] * other.getNumerator();
        return new Rational(numerator, denominator);
    }

    public Rational multiply(Rational other)
    {
        long denominator = r[1] * other.getDenominator();
        long numerator = r[0] * other.getNumerator();
        return new Rational(numerator, denominator);
    }

    public Rational divide(Rational other)
    {
        long denominator = r[1] * other.getNumerator();
        long numerator = r[0] * other.getDenominator();
        return new Rational(numerator, denominator);
    }

    @Override
    public String toString()
    {
        return r[0] + "/" + r[1];
    }
}
