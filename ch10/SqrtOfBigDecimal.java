import java.math.BigInteger;
import java.math.BigDecimal;

public class SqrtOfBigDecimal
{
	public static BigDecimal sqrt(BigInteger bigInteger)
	{
		return sqrt(new BigDecimal(bigInteger));
	}
	
	public static BigDecimal sqrt(BigDecimal bigDecimal)
	{
		if (bigDecimal.compareTo(BigDecimal.ZERO) == 0)
		{
			return BigDecimal.ZERO;
		}
		BigDecimal error = new BigDecimal(1);
		BigDecimal root1 = new BigDecimal(1);
		BigDecimal root2 = new BigDecimal(1);
		while (error.compareTo(new BigDecimal(0.1)) > 0)
		{
			root1 = root2;
			root2 = (bigDecimal.divide(root1, 2).add(root1)).multiply(new BigDecimal(0.5));
			error = root2.subtract(root1).abs();
		}
		return root2;
	}
	
	public static void main(String[] args)
	{
		BigDecimal bigDecimal = sqrt(new BigDecimal("1000000000000000000000000000000000000000000000000000000"));
		System.out.println(bigDecimal.toBigInteger());
	}
}