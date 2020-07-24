import java.util.Scanner;
public class Exercise09_11
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double[] coefficients = new double[6];
		
		System.out.println("enter a,b,c,d,e and f");
		for (double value: coefficients)
		{
			value = in.nextDouble();
		}
		LinearEquation twoBytwo;
		twoBytwo = new LinearEquation(coefficients[0], coefficients[1], 
									  coefficients[2], coefficients[3],
									  coefficients[4], coefficients[5]);
									  
		if (twoBytwo.isSovable())
		{
			System.out.println("x=" + twoBytwo.getX() + 
								"Y=" + twoBytwo.getY());
		}
		else
			System.out.println("Unsolvable");
	}
}

class LinearEquation
{
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation(double a, double b,
				   double c, double d,
				   double e, double f)
		{
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
		}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	public double getD()
	{
		return d;
	}
	
	public double getE()
	{
		return e;
	}
	
	public double getF()
	{
		return f;
	}
	
	public boolean isSovable()
	{
		if (a * d - b * c != 0)
			return true;
		else
			return false;
	}
	
	public double getX()
	{
		return (e * d - b * f) /(a * d - b * c);
	}
	
	public double getY()
	{
		return (a * f - e * c) / (a * d - b * c);
	}
}