import java.math.*;

public class LargeFactorial
{
	public static void main(String[] args)
	{
		System.out.println("50! = " + factorial(50));
	}
	
	public static BigInteger factorial(long n)
	{
		BigInteger prod = new BigInteger("1");
		for (long i = 0; i < n; i++)
		{
			prod = prod.multiply(new BigInteger(i + 1 + ""));
		}
		
		return prod;
	}
}