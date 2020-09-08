import java.util.GregorianCalendar;
public class MyDate
{
	private int year;
	private int month;
	private int day;
	
	public MyDate()
	{
		setDate(System.currentTimeMillis());
	}
	
	public MyDate(long elapsedTime)
	{
		setDate(elapsedTime);
	}
	
	public MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setDate(long elapsedTime)
	{
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		year = date.get(date.YEAR);
		month = date.get(date.MONTH);
		day = date.get(date.DAY_OF_MONTH);
	}
	
	public String toString()
	{
		return year + "/" 
			+ month + "/"
			+ day;
	}
}