public class MyLine
{
	//line equation: aX + bY = c
	private double a;
	private double b;
	private double c;
	
	public MyLine(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public MyLine(MyPoint p1, MyPoint p2)
	{
		if (p1.getX() - p2.getX() != 0)
		{
			a = - (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
			b = 1;
			c = p1.getY() + a * p1.getX();
		}
		else 
		{
			if (p1.getY() == p1.getY())
			{
				a = 0;
				b = 0;
				c = 0;
			}
			else
			{
				a = 1;
				b = 0;
				c = p1.getX();
			}
		}
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
	
	public static boolean isCrosses(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4)
	{
		MyLine L12 = new MyLine(p1, p2);
		MyLine L34 = new MyLine(p3, p4);
		if (L12.isOverlaps(L34))
		{
			return true;
		}
		
		if (!L12.isCrosses(L34))
		{
			return false;
		}
		
		LinearEquation equation = new LinearEquation(L12.getA(), L12.getB(), L12.getC(), L34.getA(), L34.getB(), L34.getC());
		double x = equation.getX();
		if (Math.abs(x - p1.getX()) + Math.abs(x - p2.getX()) != Math.abs(p1.getX() - p2.getX()))
		{
			return false;
		}
		if (Math.abs(x - p3.getX()) + Math.abs(x - p4.getX()) != Math.abs(p3.getX() - p4.getX()))
		{
			return false;
		}
		return true;
	}
	public boolean isCrosses(MyLine otherLine)
	{
		LinearEquation equation = new LinearEquation(a, b, c, otherLine.getA(), otherLine.getB(), otherLine.getC());
		return equation.isSolvable();
	}
	
	public boolean isOverlaps(MyLine otherLine)
	{
		return a == otherLine.getA() && b == otherLine.getB() && c == otherLine.getC();
	}
}