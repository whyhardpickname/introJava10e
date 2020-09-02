public class Vector
{
	double x;
	double y;
	
	public Vector(MyPoint start, MyPoint end)
	{
		this(end.getX() - start.getX(), end.getY() - start.getY());
	}
	
	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double dot(double x, double y)
	{
		return this.x * x + this.y * y;
	}
	
	public double dot(Vector otherVector)
	{
		return dot(otherVector.getX(), otherVector.getY());
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