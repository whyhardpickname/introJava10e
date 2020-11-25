package exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/25 17:09
 */
public class ex20
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\srcRootDirectory");
        File[] dirs = file.listFiles();
        for (File d : dirs)
        {
            for (File f : d.listFiles())
            {
                StringBuffer stringBuffer = new StringBuffer();
                Scanner in = new Scanner(f);
                if (in.hasNext())
                {
                    in.nextLine();
                }
                while (in.hasNext())
                {
                    stringBuffer.append(in.nextLine() + "\n");
                }
                PrintWriter printWriter = new PrintWriter(f);
                printWriter.print(stringBuffer);
                printWriter.close();
            }
        }
    }
}
