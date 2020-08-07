public class Exercise10_01
{
	public static void main(String[] args)
	{
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
}

class Time
{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Time(long elapseTime)
	{
		setTime(elapseTime);
	}
	
	public Time()
	{
		this(System.currentTimeMillis());
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public void setTime(long elapseTime)
	{
		long seconds = elapseTime / 1000;
		second = (int) (seconds % 60);
		
		long minutes = seconds / 60;
		minute = (int) (minutes % 60);
		
		long hours = minutes / 60;
		hour = (int) (hours % 24);
	}
	
	public String toString()
	{
		String time = String.format("%d:%02d:%02d", hour, minute, second);
		return time;
	}
}

