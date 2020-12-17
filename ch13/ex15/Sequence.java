package ex15;

import java.io.SequenceInputStream;
import java.math.BigInteger;

/**
 * @author MarkChern
 * date 2020/12/17 17:14
 */
public class Sequence
{
    private int n;

    public Sequence(int n)
    {
        this.n = n;
    }

    public Rational sum()
    {
        Rational sum = new Rational();
        for (int i = 1; i <= n; i++)
        {
            sum = sum.add(new Rational(BigInteger.valueOf(i), BigInteger.valueOf(i + 1)));
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Sequence sequence = new Sequence(99);
        System.out.println(sequence.sum());
    }
}
