package exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ex18
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\srcRootDirectory");
        File[] dirs = file.listFiles();
        File[] files;
        ArrayList<ArrayList<String>> filePaths = new ArrayList<>();
        for (int i = 0; i < dirs.length; i++)
        {
            ArrayList<String> names = new ArrayList<>();
            names.add(dirs[i].getName());
            files = dirs[i].listFiles();
            for (File f : files)
            {
                names.add(f.getName());
            }
            filePaths.add(names);
        }

        for (int i = 0; i < filePaths.size(); i++)
        {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("package " + filePaths.get(i).get(0) + ";");

            File file1 = new File();
        }

    }
}
