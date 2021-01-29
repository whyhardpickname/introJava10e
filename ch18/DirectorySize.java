import java.io.File;
import java.io.PrintStream;

/**
 * @author MarkChern
 */
public class DirectorySize
{
    public static int count = 0;
    public static void main(String[] args)
    {
        File file = new File("srcRootDirectory");
        if (!file.isDirectory())
        {
            System.out.println("The file doesn't exits.");
            System.exit(1);
        }

        getSize(file);
        System.out.println(count);

    }

    public static int getSize(File file)
    {
        count++;
        int size = 0;
        if (file.isDirectory())
        {
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++)
            {
                size += getSize(files[i]);
            }
        }
        else
        {
            size += file.length();
        }
        return size;
    }
}
