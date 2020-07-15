public class Exercise01_04 
{
	public static void main(String[] args) 
	{
		System.out.println("a      a^2    a^3");

		for (int i = 0; i < 4 ; i++ )
		{
			System.out.printf("%-7.0f", Math.pow(i + 1, 1));
			System.out.printf("%-7.0f", Math.pow(i + 1, 2));
			System.out.printf("%-7.0f", Math.pow(i + 1, 3));
			System.out.println();
		}
	}
}
