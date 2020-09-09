import java.math.BigInteger;
import java.lang.Long;

public class Exercise10_17
{
	public static void main(String[] args)
	{
		BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
		bigInteger = bigInteger.add(BigInteger.ONE);
		BigInteger n = bigInteger;
		BigInteger i = BigInteger.ZERO;
		int count = 10;
		while (bigInteger.subtract(i.add(BigInteger.ONE).multiply(i.add(BigInteger.ONE))).compareTo(BigInteger.ZERO) > 0)
		{
			i = i.add(BigInteger.ONE);
			BigInteger j = BigInteger.ONE;
			while (bigInteger.subtract(i.add(j.multiply(BigInteger.valueOf(2))).multiply(i.add(j.multiply(BigInteger.valueOf(2))))).compareTo(BigInteger.ZERO) > 0)
			{
				j = j.multiply(BigInteger.valueOf(2));
			}
			i = i.add(j);
		}
		for (int j = 0; j < count; j++)
		{
			System.out.println(i.multiply(i));
			i = i.add(BigInteger.ONE);
		}
		
	}
}