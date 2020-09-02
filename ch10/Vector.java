public class Vector
{
	double x;
	double y;
	
	public vector(MyPoint start, MyPoint end)
	{
		this(end.getX() - start.getX(), end.getY() - start.getY());
	}
	
	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double dotMultiply(double x, double y)
	{
		return this.x * x + this.y * y;
	}
	
	public double dotMultiply(Vector otherVector)
	{
		return this(otherVector.getX(), otherVector.getY());
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