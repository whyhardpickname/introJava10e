public class Exercise01_13
{
	public static void main(String[] args)
	{
		TwoBy2LinearEquations equations = new TwoBy2LinearEquations(3.4, 50.2, 2.1, 0.55, 44.5, 5.9);
		System.out.println(equations.getX());
		System.out.println(equations.getY());
	}
}

class TwoBy2LinearEquations
{
	//2By2LinearEquations' form is 
	// aX + bY = e
	// cX + dY = f
	//a, b, c and d are coefficients
	//X and Y are unknows.
	double a = 0;
	double b = 0;
	double c = 0;
	double d = 0;
	double e = 0;
	double f = 0;
	
	public TwoBy2LinearEquations(double a, double b, double c, double d, double e, double f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getX()
	{
		double denominator = this.a * this.d - this.b * this.c;
		double numerator = this.e * this.d - this.b * this.f;
		return numerator / denominator;
	}
	
	public double getY()
	{
		double denominator = this.a * this.d - this.b * this.c;
		double numerator = this.a * this.f - this.e * this.c;
		return numerator / denominator;
	}
}