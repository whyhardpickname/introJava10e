public class Exercise01_12
{
	public static void main(String[] args)
	{
		double miles = 24 * 1.6;
		double hours = 1 + 40 / 60.0 + 35 / 3600.0;
		System.out.println(speed(miles, hours));
	}
	
	public static double speed(double miles, double hours)
	{
		return miles / hours;
	}
}