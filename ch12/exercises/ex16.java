package exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex16
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\ex16.txt");
        System.out.println(file.exists());
        Scanner in = new Scanner(file);

        StringBuffer stringBuffer = new StringBuffer();
        while (in.hasNext())
        {
            String s = in.nextLine();
            stringBuffer.append(s.replaceAll("b", "c") + "\n");
        }
        PrintWriter out = new PrintWriter(file);
        out.print(stringBuffer);
        out.close();
    }
}
