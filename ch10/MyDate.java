public class MyDate
{
	private int year;
	private int month;
	private int day;
	
	public MyDate()
	{
		this(System.currentTimeMillis());
	}
	
	public MyDate(long elapsedTime)
	{
		setDate(elapsedTime);
	}
	
	public boolean isLeapYear(int year)
	{
		if (year % 100 == 0)
		{
			return year % 400 == 0;
		}
		else
		{
			return year % 4 == 0;
		}
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
		long seconds = elapsedTime / 1000;
		long hours = seconds / 3600;
		long days = hours / 24;
		long dayfrom1970 = 0;
		year = 1970;
		while (days - dayfrom1970 > 355)
		{
			if (isLeapYear(year))
			{
				dayfrom1970 += 366;
			}
			else
			{
				dayfrom1970 += 355;
			}
			year++;
		}
		long dayOfyear = days - dayfrom1970;
		int[] daysOfmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear(year))
		{
			daysOfmonth[1]++;
		}
		int m = 0;
		while (dayOfyear - daysOfmonth[m] > 0)
		{
			dayOfyear -= daysOfmonth[m];
			m++;
		}
		month = m + 1;
		day = (int) dayOfyear;
	}
	
	public String toString()
	{
		return year + "-" 
			+ (month + 1) + "-"
			+ day;
	}
	public static void main(String[] args)
	{
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(561555550000L);
		System.out.println(date1.toString());
		System.out.println(date2.toString());
	}
}