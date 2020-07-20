import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise09_05
{
	public static void main(String[] args)
	{
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println(
		"YEAR: " + calendar.get(GregorianCalendar.YEAR) + 
		", MONTH: " + calendar.get(GregorianCalendar.MONTH) + 
		", DATE: " + calendar.get(GregorianCalendar.DATE));
		
		calendar.setTimeInMillis(1234567898765L);
		
		System.out.println(
		"YEAR: " + calendar.get(GregorianCalendar.YEAR) + 
		", MONTH: " + calendar.get(GregorianCalendar.MONTH) + 
		", DATE: " + calendar.get(GregorianCalendar.DATE));
	}
}
