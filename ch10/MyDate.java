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
		if (year % 400 == 0 || year % 4 == 0)
		{
			return true;
		}
		return false;
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
		double seconds = elapsedTime / 1000;
		double hours = seconds / 3600;
		double days = hours / 24;
		double dayfrom1970 = 0;
		double yearDay = 365;
		year = 1970;
		while (dayfrom1970 + yearDay <= days)
		{
			if (isLeapYear(year))
			{
				yearDay = 366;
				dayfrom1970 += yearDay;
			}
			else
			{
				yearDay = 365;
				dayfrom1970 += yearDay;
			}
			year++;
		}
		double dayOfyear = days - dayfrom1970;
		double monthDay = 0;
		int[] daysOfmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear(year))
		{
			daysOfmonth[1]++;
		}
		int m = 0;
		while (monthDay + daysOfmonth[m] <= dayOfyear)
		{
			monthDay += daysOfmonth[m];
			m++;
		}
		month = m + 1;
		day = (int) Math.ceil(dayOfyear - monthDay + 1);
	}
	
	public String toString()
	{
		return year + "-" 
			+ month + "-"
			+ day;
	}
}