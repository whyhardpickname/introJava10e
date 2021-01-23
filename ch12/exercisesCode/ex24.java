package exercisesCode;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * @author MarkChern
 * date 2020/11/27 16:23
 */
public class ex24
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("Salary.txt");

        if (file.exists())
        {
            System.exit(1);
        }

        PrintWriter writer = new PrintWriter(file);

        int lines = 1000;
        String[] levers = {"assistant", "associate", "full"};
        int[] ranges = {50000, 80000, 60000, 110000, 75000, 130000};

        Random random = new Random();
        for (int i = 0; i < lines; i++)
        {
            int lever = random.nextInt(levers.length);
            int offset = ranges[2 * lever];
            int bound = ranges[2 * lever + 1] - ranges[2 * lever];

            writer.println("FirstName" + (i + 1)
                    + " LastName" + (i + 1)
                    + " " + levers[lever]
                    + " " + (offset + random.nextInt(bound)));
        }
    }
}
