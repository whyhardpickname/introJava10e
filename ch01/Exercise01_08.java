public class Exercise01_08
{
	public static void main(String[] args) 
	{
		System.out.println(circumference(5.5));
		System.out.println(cycleArea(5.5));
	}

	public static double circumference(double radius)
	{
		return 2 * Math.PI * radius;
	}

	public static double cycleArea(double radius)
	{
		return Math.PI * Math.pow(radius, 2);
	}
}
