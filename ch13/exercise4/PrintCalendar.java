package exercise4;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author MarkChern
 * date 2020/12/8 17:23
 */
public class PrintCalendar
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        if (args.length == 2)
        {
            calendar.set(Calendar.YEAR, Integer.parseInt(args[0]));
            calendar.set(Calendar.MONTH, Integer.parseInt(args[1]) - 1);
        }
        else if (args.length == 1)
        {
            calendar.set(Calendar.YEAR, Integer.parseInt(args[0]));
        }

        System.out.println(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月");
        System.out.println("------------------");
        System.out.println("MON TUE WED THU FRI SAT SUN");

        //获取月份第一天的星期数
        int today = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < firstDayOfWeek - 1; i++)
        {
            System.out.print("    ");
        }

        int month = calendar.get(Calendar.MONTH);
        while (calendar.get(Calendar.MONTH) == month)
        {
            int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
            if (dayOfMonth != today)
            {
                System.out.printf("%3d ", dayOfMonth);
            }
            else
            {
                System.out.printf("%3d*", dayOfMonth);
            }

            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            {
                System.out.println();
            }
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth + 1);
        }

    }
}
