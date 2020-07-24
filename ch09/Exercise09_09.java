public class Exercise09_09
{
	public static void main(String[] args)
	{
		RegularPolygon[] polygon = new RegularPolygon[3];
		polygon[0] = new RegularPolygon();
		polygon[1] = new RegularPolygon(6, 4);
		polygon[2] = new RegularPolygon(10, 4, 5.6, 7.8);
		
		int i  = 0;
		for (RegularPolygon p: polygon)
		{
			System.out.println("polygon" + (i++)
				+ " perimeter=" + p.getPerimeter()
				+ " area=" + p.getArea());
		}
	}
}


class RegularPolygon
{
	private int n = 3;
	private double side = 1.0;
	private double x = 0.0;
	private double y = 0.0;
	
	public RegularPolygon()
	{
	}
	
	public RegularPolygon(int n, double side, double x, double y)
	{
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public RegularPolygon(int n, double side)
	{
		this(n, side, 0.0, 0.0);
	}
	
	public int getN()
	{
		return n;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void	setN(int n)
	{
		this.n = n;
	}
	
	public void setSide(double side)
	{
		this.side = side;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double getPerimeter()
	{
		return n * side;
	}
	
	public double getArea()
	{
		return	n * side * side / (4 * Math.tan(Math.PI / n));
	}
}