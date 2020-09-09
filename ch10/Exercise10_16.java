import java.math.BigInteger;

public class Exercise10_16
{
	public static void main(String[] args)
	{
		int length = 50;
		char[] digits = new char[length];
		digits[0] = '1';
		for (int i = 1; i < digits.length; i++)
		{
			digits[i] = '0';
		}
		BigInteger bigInteger = new BigInteger(new String(digits));
		
		int count = 0;
		while (count <= 10)
		{
			if (bigInteger.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)
				|| bigInteger.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
			{
				System.out.println(bigInteger);
				count++;
			}
			bigInteger = bigInteger.add(BigInteger.ONE);
		}
	}
}