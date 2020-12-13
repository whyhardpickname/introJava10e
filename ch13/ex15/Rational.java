package ex15;

import java.math.BigInteger;

/**
 * @author MarkChern
 * date 2020/12/12 17:05
 */
public class Rational
{
    private BigInteger numerator;
    private BigInteger denominator;

    public Rational()
    {
        numerator = BigInteger.valueOf(0);
        denominator = BigInteger.valueOf(1);
    }
    public Rational(BigInteger numerator, BigInteger denominator)
    {
        long gcd = gcd(numerator, denominator);
        r[0] = Math.abs(numerator) / gcd;
        r[1] = Math.abs(denominator / gcd);
    }

    private BigInteger gcd(BigInteger a, BigInteger b)
    {
        if (a.mod(b).compareTo(BigInteger.valueOf(0)) == 0)
        {
            return b;
        }
        return gcd(b, (a.mod(b));
    }

    public BigInteger getNumerator()
    {
        return numerator;
    }

    public void setNumerator(BigInteger numerator)
    {
        this.numerator = numerator;
    }

    public BigInteger getDenominator()
    {
        return denominator;
    }

    public void setDenominator(BigInteger denominator)
    {
        this.denominator = denominator;
    }

    public Rational add(Rational other)
    {
        BigInteger denominator = this.denominator.multiply(other.denominator);
        BigInteger numerator = this.numerator.multiply(other.getDenominator())
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
        return "Rational{" +
                "Numerator=" + r[0] + " " +
                "Denominator=" + r[1] +
                '}';
    }
}
