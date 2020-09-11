import java.math.BigInteger;
import java.lang.Long;

public class Exercise10_19
{
	public static void main(String[] args)
	{
		BigInteger bigInteger = BigInteger.valueOf(2);
		for (int p = 2; p < 10; p++)
		{
			bigInteger = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);
			if (isPrime(bigInteger))
			{
				System.out.println(bigInteger);
			}
		}
		
		
	}
	
	public static boolean isPrime(BigInteger bigInteger)
	{
		BigInteger i = BigInteger.valueOf(2);
		BigInteger sqrtOfBigInteger = SqrtOfBigDecimal.sqrt(bigInteger).toBigInteger();
		while (i.compareTo(bigInteger) < 0)
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