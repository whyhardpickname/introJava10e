public class MyRectangle2D
{
	private double x;
	private double y;
	private double width;
	private double height;
	
	public MyRectangle2D()
	{
		this(0, 0, 1, 1);
	}
	
	public MyRectangle2D(double x, double y, double width, double height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
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
	
	public boolean contains(double x, double y)
	{
		return x >= (this.x - width / 2) 
			&& x <= (this.x + width / 2)
			&& y >= (this.y - height / 2) 
			&& y <= (this.y + height / 2);
	}
	
	public boolean contains(MyRectangle2D r)
	{
		return contains(r.getX() - width / 2, r.getY() - height / 2)
			&& contains(r.getX() + width / 2, r.getY() + height / 2);
	}
	
	public boolean overlaps(MyRectangle2D r)
	{
		if (this.contains(r) || r.contains(this))
		{
			return false;
		}
		return Math.abs(x - r.getX()) <= ((width + r.getWidth()) / 2)
			&& Math.abs(x - r.getY()) <= ((width + r.getHeight()) / 2);
	}
	
}