package exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/25 17:12
 */
public class ex21
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\ex21.txt");
        try
        {
            try (Scanner in = new Scanner(file))
            {
                String last = "";
                while (in.hasNext())
                {
                    String s = in.next();
                    if (last.compareTo(s) > 0)
                    {
                        System.out.println(last + " " + s);
                        System.exit(1);
                    }
                    last = s;
                }
                System.out.println("It is sorted.");
            }
        }
        catch (IOException e)
        {
            System.out.println("no such file");
        }
    }
}
