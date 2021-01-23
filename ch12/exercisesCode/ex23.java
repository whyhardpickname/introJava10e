package exercisesCode;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/27 16:17
 */
public class ex23
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\fraction.txt");
        Scanner in = new Scanner(file);
        int total = 0;
        double average = 0;
        while (in.hasNextDouble())
        {
            total++;
            average += (in.nextDouble() - average) / total;
        }

        System.out.println("total: " + total);
        System.out.println("average: " + average);
    }
}
