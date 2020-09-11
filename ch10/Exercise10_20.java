import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Long;

public class Exercise10_20
{
	public static void main(String[] args)
	{
		System.out.println(e(100));
	}
	
	/*
	e = 1 + 1/1! + 1/2! + ... + 1/n!;
	n is the sum of 1 to i'th items.
	*/
	public static BigDecimal e(int n)
	{
		BigDecimal e = BigDecimal.ONE;
		for (int i = 1; i <= n; i++)
		{
			BigDecimal item = BigDecimal.valueOf(1).divide(new BigDecimal(factorial(i)), 25, RoundingMode.DOWN);
			e = e.add(item);
			
		}
		return e;
	}
	
	public static BigInteger factorial(int n)
	{
		BigInteger prod = BigInteger.ONE;
		for (int i = 2; i <= n; i++)
		{
			prod = prod.multiply(BigInteger.valueOf(i));
		}
		return prod;
	}
		
}