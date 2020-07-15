public class Exercise01_10 
{
	public static void main(String[] args) 
	{
		System.out.println(velocity(45 / 60.0 + 30 / 3600.0, 14 / 1.6));
	}

	public static double velocity(double hours, double miles)
	{
		return miles / hours;
	}
}
