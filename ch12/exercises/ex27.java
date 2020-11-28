package exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MarkChern
 * date 2020/11/28 16:51
 */
public class ex27
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
                String line = "";
                while (in.hasNextLine())
                {
                    line = in.nextLine();
                    Pattern pattern = Pattern.compile("Exercise[0-9]+_[0-9]+");
                    Matcher matcher = pattern.matcher(line);
                    String target = "";
                    if (matcher.find())
                    {
                        target = matcher.group();

                        pattern = Pattern.compile("[0-9]+");
                        matcher = pattern.matcher(target);
                        String[] nums = new String[2];
                        int i = 0;
                        while (matcher.find())
                        {
                            nums[i] = matcher.group();
                            System.out.println(nums[i]);
                            if (nums[i].length() == 1)
                            {
                                nums[i] = "0" + nums[i];
                            }
                            System.out.println(nums[i]);
                            i++;
                        }
                        String relacement = "Exercise" + nums[0] + "_" + nums[1];
                        String nline = line.replaceAll("Exercise[0-9]+_[0-9]+", relacement);
                        System.out.println(nline);
                        stringBuffer.append(nline + "\n");
                    }
                    else
                    {
                        stringBuffer.append(line + "\n");
                    }
                }
                PrintWriter printWriter = new PrintWriter(f);
                printWriter.print(stringBuffer);
                printWriter.close();
            }
        }
    }
}
