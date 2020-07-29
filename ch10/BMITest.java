public class BMITest
{
	public static void main(String[] args)
	{
		BMI mark = new BMI("mark", 26, 1.68, 66);
		BMI carl = new BMI("carl", 1.68, 66);
		
		System.out.println("mark's status: " + mark.getStatus());
		
		System.out.println("carl's status: " + carl.getStatus());
	}
}