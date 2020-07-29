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
		this.name = name;
		this.age = 20;
		this.height = height;
		this.weight = weight;
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