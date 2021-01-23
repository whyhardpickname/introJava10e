package exercisesCode;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/27 16:11
 */
public class ex22
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
                while (in.hasNext())
                {
                    String line = in.nextLine();
                    stringBuffer.append(line.replaceAll(args[0], args[1]) + "\n");
                }
                PrintWriter printWriter = new PrintWriter(f);
                printWriter.print(stringBuffer);
                printWriter.close();
            }
        }
    }
}
