package ch10;
public class MyPoint
{
	double x;
	double y;
	
	public MyPoint()
	{
		this(0, 0);
	}
	
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint p)
	{
		return Math.sqrt(Math.pow((x - p.getX()), 2) + Math.pow((y - p.getY()), 2));
	}
	
	public double distance(double x, double y)
	{
		return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setX()
	{
		this.x = x;
	}
	
	public void setY()
	{
		this.y = y;
	}
}