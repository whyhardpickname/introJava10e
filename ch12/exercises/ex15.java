package exercises;

import java.io.*;
import java.util.Random;

public class ex15
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\ex15.txt");
        PrintWriter printWriter = new PrintWriter(file);
        Random random = new Random();
        for (int i = 0; i < 100; i++)
        {
            printWriter.print(random.nextInt(100) + " ");
            if ((i + 1) % 10 == 0)
            {
                printWriter.write("\n");
            }
        }
        printWriter.close();
    }
}
