public class Exercise10_04
{
	public static void main(String[] args)
	{
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		
		System.out.println(p1.distance(p2));
	}
}

class MyPoint
{
	double x;
	double y;
	
	public MyPoint()
	{
		this.x = 0;
		this.y = 0;
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
}