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
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = numerator.abs().divide(gcd);
        this.denominator = denominator.divide(gcd).abs();
    }

    private BigInteger gcd(BigInteger a, BigInteger b)
    {
        if (a.mod(b).compareTo(BigInteger.valueOf(0)) == 0)
        {
            return b;
        }
        return gcd(b, a.mod(b));
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
        BigInteger numerator = this.numerator.multiply(other.getDenominator()).add(
                this.denominator.multiply(other.getNumerator()));
        return new Rational(numerator, denominator);
    }

    public Rational subtract(Rational other)
    {
        BigInteger denominator = this.denominator.multiply(other.getDenominator());
        BigInteger numerator = this.numerator.multiply(other.getDenominator()).subtract(
                this.denominator.multiply(other.getNumerator()));
        return new Rational(numerator, denominator);
    }

    public Rational multiply(Rational other)
    {
        BigInteger denominator = this.denominator.multiply(other.getDenominator());
        BigInteger numerator = this.numerator.multiply(other.getNumerator());
        return new Rational(numerator, denominator);
    }

    public Rational divide(Rational other)
    {
        BigInteger denominator = this.denominator.multiply(other.getNumerator());
        BigInteger numerator = this.numerator.multiply(other.getDenominator());
        return new Rational(numerator, denominator);
    }

    @Override
    public String toString()
    {
        return "Rational{" +
                "Numerator=" + getNumerator() + " " +
                "Denominator=" + getDenominator() +
                '}';
    }
}
