import java.math.BigInteger;
import java.lang.Long;

public class Exercise10_18
{
	public static void main(String[] args)
	{
		BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
		bigInteger = bigInteger.add(BigInteger.ONE);
		int count = 0;
		while (count < 10)
		{
			if (isPrime(bigInteger))
			{
				count++;
				System.out.println(bigInteger);
			}
			bigInteger = bigInteger.add(BigInteger.ONE);
		}
	}
	
	public static boolean isPrime(BigInteger bigInteger)
	{
		BigInteger i = BigInteger.valueOf(2);
		BigInteger sqrtOfBigInteger = SqrtOfBigDecimal.sqrt(bigInteger).toBigInteger();
		while (i.compareTo(sqrtOfBigInteger) <= 0)
		{
			if (bigInteger.remainder(i).compareTo(BigInteger.ZERO) == 0)
			{
				return false;
			}
			i = i.add(BigInteger.ONE);
		}
		return true;
	}
		
}