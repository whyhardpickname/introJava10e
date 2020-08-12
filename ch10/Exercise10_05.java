import java.util.*;

public class Exercise10_05
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int n = in.nextInt();
		StackOfIntegers primeFactors = primeFactor(n);
		
		while (primeFactors.getSize() > 0)
		{
			System.out.print(primeFactors.pop() + " ");
		}
	}

	public static StackOfIntegers primeFactor(int n)
	{
		StackOfIntegers primeFactors = new StackOfIntegers();
		int i = 2;
		int N = n;
		while (N > 1)
		{
			if (N % i == 0 && isPrime(i))
			{
				primeFactors.push(i);
				N /= i;
			}
			else
			{
				i++;
			}
		}
		return primeFactors;
	}
	
	public static boolean isPrime(int n)
	{
		if (n < 2)
			return false;
		
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
