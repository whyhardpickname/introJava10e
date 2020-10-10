package ch10;
public class Triangle2D
{
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	public Triangle2D()
	{
		this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
	}
	
	public Triangle2D(MyPoint p1, MyPoint p2,MyPoint p3)
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
	
	public void setP3(MyPoint p3)
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
	
	public boolean contains(double x, double y)
	{
		return contains(new MyPoint(x, y));
	}
	
	public boolean contains(MyPoint p)
	{
		Vector v1 = new Vector(p1, p2);
		Vector v0 = new Vector(p1, p3);
		Vector v2 = new Vector(p1, p);
		double divisor = v0.dot(v0) * v1.dot(v1) - v0.dot(v1) * v0.dot(v1);
		double u = (v1.dot(v1) * v2.dot(v0) - v1.dot(v0) * v2.dot(v1)) / divisor;
		if (u < 0 || u > 1)
		{
			return false;
		}
		double v = (v0.dot(v0) * v2.dot(v1) - v0.dot(v1) * v2.dot(v0)) / divisor;
		if (v < 0 || v > 1)
		{
			return false;
		}
		return u + v <= 1;
	}
	
	public boolean contains(MyPoint p1, MyPoint p2)
	{
		if (contains(p1) || contains(p2))
		{
			return true;
		}
		MyLine line = new MyLine(p1, p2);
		MyLine[] lines = new MyLine[3];
		lines[0] = new MyLine(this.p1, this.p2);
		lines[1] = new MyLine(this.p1, this.p3);
		lines[2] = new MyLine(this.p2, this.p3);
		for (int i = 0; i < lines.length; i++)
		{
			LinearEquation e = new LinearEquation(line.getA(), line.getB(), lines[i].getA(), lines[i].getB(), line.getC(), lines[i].getC());
			if (e.isSolvable() && contains(new MyPoint(e.getX(), e.getY())))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(Triangle2D t)
	{
		return contains(t.getP1()) 
			&& contains(t.getP2())
			&& contains(t.getP3());
	}
	
	public boolean overlaps(Triangle2D t)
	{
		if (this.contains(t) || t.contains(this))
		{
			return false;
		}
		System.out.println("not contains");
		return contains(t.getP1(), t.getP2())
			|| contains(t.getP1(), t.getP3())
			|| contains(t.getP2(), t.getP3());
	}
	
	public static void main(String[] args)
	{
		Triangle2D t1 = new Triangle2D(
			new MyPoint(0, 0),
			new MyPoint(2, 0),
			new MyPoint(1, 2));
		MyPoint p1 = new MyPoint(0, 1);
		MyPoint p2 = new MyPoint(2, 1);
		System.out.println("contains(p1)=" + t1.contains(p1));
		System.out.println("contains(p2)=" + t1.contains(p2));
		System.out.println("contains(p1, p2)=" + t1.contains(p1, p2));
	}
}