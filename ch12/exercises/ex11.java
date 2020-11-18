package exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex11
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\target.txt");
        if (!file.exists())
        {
            System.out.println("file doesn't exit.");
            System.exit(1);
        }
        Scanner in = new Scanner(file);
        StringBuffer stringBuffer = new StringBuffer();
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            stringBuffer.append(line.replaceAll(args[0], "b") + "\n");
        }
        PrintWriter writer = new PrintWriter(file);
        writer.print(stringBuffer);
        writer.close();
    }
}
