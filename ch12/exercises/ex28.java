package exercises;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MarkChern
 * date 2020/11/29 15:40
 */
public class ex28
{
    public static void main(String[] args)
    {
        File dir = new File(".\\srcRootDirectory");

        for (File d : dir.listFiles())
        {
            for (File f : d.listFiles())
            {
                if (Pattern.matches("Exercise[0-9]+_[0-9]+\\.java", f.getName()))
                {
                    Pattern pattern = Pattern.compile("[0-9]+");
                    Matcher matcher = pattern.matcher(f.getName());
                    StringBuffer fileName = new StringBuffer(f.getName());
                    int index = 0;
                    int cout = 0;
                    while (matcher.find())
                    {
                        cout++;
                        if (matcher.group().length() == 1)
                        {
                            index = fileName.indexOf(matcher.group(), index);
                            if (cout == Integer.parseInt(args[0]))
                            {
                                fileName.insert(index, '0');
                                index += 2;
                            }
                            else
                            {
                                index++;
                            }
                        }
                    }
                    String filePath = f.getPath();
                    filePath = filePath.replaceAll(f.getName(), fileName.toString());
                    filePath = filePath.replace("\\", "\\\\");
                    f.renameTo(new File(filePath));
                }
            }
        }
    }
}
