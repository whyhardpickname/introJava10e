public class Exercise09_08
{
	public static void main(String[] args)
	{
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(Fan.FAST);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5.0);
		fan2.setOn(false);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
		

	}
}

class Fan
{
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5.0;
	private String color = "blue";
	
	public Fan()
	{
		;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public boolean isOn()
	{
		return on;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public void setOn(boolean isOn)
	{
		this.on = isOn;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String toString()
	{
		if (this.isOn())
		{
			return "Fan[speed=" + speed
				+ ", color=" + color
				+ ", radius=" + radius
				+ "]";
		}
		else
		{
			return "Fan is off[color=" + color
				+ ", radius=" + radius
				+ "]";
		}
	}
	
	
}