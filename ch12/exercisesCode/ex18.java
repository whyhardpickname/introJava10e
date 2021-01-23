package exercisesCode;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex18
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
                stringBuffer.append("package " + f.getParentFile().getName() + ";\n");
                Scanner in = new Scanner(f);
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
