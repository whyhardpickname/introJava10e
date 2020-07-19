public class Exercise09_01
{
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle(4.0, 40.0);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		System.out.println(rectangle1.toString());
		System.out.println(rectangle2.toString());
	}
}

class Rectangle
{
	private double width;
	private double height;
	
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public Rectangle()
	{
		this(1.0, 1.0);
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getArea()
	{
		return width * height;
	}
	
	public double getPerimeter()
	{
		return 2 * (width + height);
	}
	
	public String toString()
	{
		return "Rectangle[width=" + width
			+ ", height=" + height
			+ ", Area=" + getArea()
			+ ", Perimeter=" + getPerimeter()
			+ "]";
	}
}