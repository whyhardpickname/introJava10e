public class Exercise01_09
{
	public static void main(String[] args) 
	{
		System.out.println(retangularArea(7.9, 4.5));
		System.out.println(retangularPerimiter(7.9, 4.5));
	}

	public static double retangularArea(double length, double width)
	{
		return length * width;
	}

	public static double retangularPerimiter(double length, double width)
	{
		return 2 * (length + width);
	}
}
