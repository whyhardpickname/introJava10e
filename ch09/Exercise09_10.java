import java.util.*;
public class Exercise09_10
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		QuadraticEquation q;
		double[] coefficients = new double[3];
		System.out.println("enter a, b and c");
		for (int i = 0; i < 3; i++)
		{
			coefficients[i] = in.nextDouble();
		}
		
		q = new QuadraticEquation(coefficients[0], coefficients[1], coefficients[2]);
		
		System.out.println("Discriminant = " + q.getDiscriminant());
		if (q.getDiscriminant() > 0)
			System.out.println("root1=" + q.getRoot1()
							+ ", root2=" + q.getRoot2());
		else if (q.getDiscriminant() == 0)
			System.out.println("root1=" + q.getRoot1());
		else
			System.out.println("The equation has no roots.");
	}
}

class QuadraticEquation
{
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA()
	{
		return this.a;
	}
	
	public double getB()
	{
		return this.b;
	}
	
	public double getC()
	{
		return this.c;
	}
	
	public double getDiscriminant()
	{
		return this.b * this.b - 4 * this.a * this.c;
	}
	
	public double getRoot1()
	{
		if (this.getDiscriminant() < 0)
			return 0;
		
		return (-1 * b + Math.sqrt(this.getDiscriminant()))
			/ (2 * a);
	}
	
	public double getRoot2()
	{
		if (this.getDiscriminant() < 0)
			return 0;
		
		return (-1 * b - Math.sqrt(this.getDiscriminant()))
			/ (2 * a);
	}
}