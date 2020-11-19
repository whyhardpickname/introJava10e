package exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ex14
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\fraction.txt");
        Scanner in = new Scanner(file);
        double sum = 0;
        int counter = 0;
        while (in.hasNextDouble())
        {
            sum += in.nextDouble();
            counter++;
        }
        System.out.println("sum: " + sum);
        System.out.println("avg: " + sum / counter);
    }
}
