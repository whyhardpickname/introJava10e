package exercisesCode;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ex12
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\source.java");
        if (file.exists())
        {
            System.out.println("file exits.");
        }
        Scanner in = new Scanner(file);
        StringBuffer stringBuffer = new StringBuffer();

        while (in.hasNextLine())
        {
            String current = in.nextLine();
            String temp = current.trim();
            if (temp.length() > 0 && Character.compare(temp.charAt(0), '{') == 0)
            {
                temp = temp.replace("{", " {\n");
                stringBuffer.append(temp);
            }
            else
            {
                stringBuffer.append("\n" + current);
            }
        }
        PrintWriter writer = new PrintWriter(file);
        writer.print(stringBuffer);
        writer.close();
    }
}