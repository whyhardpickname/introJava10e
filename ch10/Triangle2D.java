public class Triangle2D
{
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	public MyTriangle2D()
	{
		this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
	}
	
	public MyTriangle2D(MyPoint p1, MyPoint p2,MyPoint p3,)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public MyPoint getP1()
	{
		return p1;
	}
	
	public MyPoint getP2()
	{
		return p2;
	}
	
	public MyPoint getP3()
	{
		return p3;
	}
	
	public void setP1(MyPoint p1)
	{
		this.p1 = p1;
	}
	
	public void setP2(MyPoint p2)
	{
		this.p2 = p2;
	}
	
	public void setP1(MyPoint p3)
	{
		this.p3 = p3;
	}
	
	public double getArea()
	{
		double p = 0.5 * getPerimeter();
		return Math.sqrt(p * (p - p1.distance(p2)) * (p - p1.distance(p3)) * (p - p2.distance(p3)));
	}
	
	public double getPerimeter()
	{
		return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
	}
	
	public boolean contains(MyPoint p)
	{
		Vector vector21 = Vector(p1, p2);
		Vector vector31 = Vector(p1, p3);
		//todo
	}
}