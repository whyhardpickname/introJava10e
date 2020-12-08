package exercise4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author MarkChern
 * date 2020/12/8 17:23
 */
public class PrintCalendar
{
    public void printCalendar(int year, int month)
    {
        Calendar calendar = new GregorianCalendar(year, month, 1);

        System.out.println(calendar.get(Calendar.MONTH) + ", " + calendar.get(Calendar.YEAR));
    }
}
