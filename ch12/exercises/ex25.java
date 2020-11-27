package exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MarkChern
 * date 2020/11/27 17:04
 */
public class ex25
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("Salary.txt");
        Scanner in = new Scanner(file);
        String[] levers = {"assistant", "associate", "full"};
        int[] numbers = {0, 0, 0};
        double[] totals = {0, 0, 0};
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            int index = 0;
            if (line.contains("assistant"))
            {
                index = 0;
            }
            else if (line.contains("associate"))
            {
                index = 1;
            }
            else if (line.contains("full"))
            {
                index = 2;
            }
            numbers[index] ++;
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(line);
            totals[index] += Double.parseDouble(matcher.group(1));
        }

        for (int i = 0 ; i < numbers.length; i++)
        {
            System.out.println(levers[i] + " numbers: " + numbers[i]
                + " average: " + (1.0 * totals[i] / numbers[i]));
        }
    }
}
