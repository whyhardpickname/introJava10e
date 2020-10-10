package ch10;
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
			if (p1.getY() != p2.getY())
			{
				a = 1;
				b = 0;
				c = p1.getX();
			}
			else
			{
				a = 0;
				b = 0;
				c = 0;
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
	
	public static void main(String[] args)
	{
		MyPoint p1 = new MyPoint(0, 0);
		MyPoint p2 = new MyPoint(0, 1);
		MyPoint p3 = new MyPoint(1, 1);
		
		MyLine line12 = new MyLine(p1, p2);
		MyLine line13 = new MyLine(p1, p3);
		MyLine line23 = new MyLine(p2, p3);
		
		System.out.printf("line12 a = %.2f, b = %.2f, c = %.2f\n", line12.getA()
			, line12.getB(), line12.getC());
		System.out.printf("line13 a = %.2f, b = %.2f, c = %.2f\n", line13.getA()
			, line13.getB(), line13.getC());
		System.out.printf("line23 a = %.2f, b = %.2f, c = %.2f\n", line23.getA()
			, line23.getB(), line23.getC());
	}
}