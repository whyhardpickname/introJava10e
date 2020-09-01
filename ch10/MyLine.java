public class Myline
{
	//line equation: aX + bY = c
	private double a;
	private double b;
	private double c;
	
	public Myline(MyPoint p1, MyPoint p2)
	{
		if (p1.getX() - p2.getX() != 0)
		{
			a = - (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
			b = 1;
			c = p1.getY + a * p1.getX();
		}
		
		if (p1.getY() == p1.getY())
		{
			a = 0;
			b = 0;
			c = 0;
		}
		a = p1.getX();
	}
	
	public MyLine(double x1, double y1, double x2, double y2)
	{
		this(new MyPoint(x1, y1), new MyPoint(x2, y2));
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
}