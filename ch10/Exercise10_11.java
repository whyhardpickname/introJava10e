public class Exercise10_11
{
	public static void main(String[] args)
	{
		Circle2D cl = new Circle2D(2, 2, 5.5);
		System.out.println("Area = " + cl.getArea());
		System.out.println("Perimeter = " + cl.getPerimeter());
		System.out.println("cl.contains(3,3) = " 
			+ cl.contains(3, 3));
		System.out.println("cl.contains(new Circle2D(4, 5, 10.5)) = " 
			+ cl.contains(new Circle2D(4, 5, 10.5)));
		
		System.out.println("cl.overlaps(new Circle2D(3, 5, 2.3)) = " 
			+ cl.overlaps(new Circle2D(3, 5, 2.3)));		
	}
}

class Circle2D
{
	private double x;
	private double y;
	private double radius;

	public Circle2D()
	{
		this(0, 0, 1);
	}
	
	public Circle2D(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	public boolean contains(double x, double y)
	{
		return ((this.x - x) * (this.x - x) 
			+ (this.y - y) * (this.y - y))
			<= (radius * radius);
	}
	
	public boolean contains(Circle2D circle)
	{
		if (radius <= circle.radius)
		{
			return false;
		}
		Circle2D tangency = new Circle2D(x, y, radius - circle.radius);
		return tangency.contains(circle);
	}
	
	public boolean overlaps(Circle2D circle)
	{
		return ((circle.x - x) * (circle.x - x) 
			+ (circle.y - y) * (circle.y - y))
			<= (circle.radius + radius) * (circle.radius + radius);
	}
}
