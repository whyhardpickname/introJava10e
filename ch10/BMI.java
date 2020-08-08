public class BMI
{
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public BMI(String name, int age, double height, double weight)
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public BMI(String name, double height, double weight)
	{
		this(name, 20, height, weight);
	}
	
	public BMI(String name, int age, double weight, double feet, double inches)
	{
		this(name, age, 0.3048 * feet + 0.0254 * inches, weight);
	}
	
	public double getBMI()
	{
		return weight / Math.pow(height, 2);
	}
	
	public String getStatus()
	{
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		
		else if (bmi < 25)
			return "nomal";
		
		else if (bmi < 30)
			return "Overweight";
		else
			return "obese";
	}
}