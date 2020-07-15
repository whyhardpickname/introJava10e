public class Exercise01_07
{
	public static void main(String[] args) 
	{
		System.out.println(calculatePI(7));
	}

	public static double calculatePI(int items)
	{
		double sum = 0;
		int sign = -1;

		for (int i = 0; i < items ; i++ )
		{
			sign *= -1;
			sum += sign * 1.0 / (2 * i + 1);
		}

		return 4 * sum;
	}
}
