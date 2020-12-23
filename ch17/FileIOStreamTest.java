import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MarkChern
 * date 2020/12/23 17:04
 */
public class FileIOStreamTest
{
    public static void main(String[] args) throws IOException
    {
        try(FileOutputStream outputStream = new FileOutputStream(".\\ch17\\fileIOStreamTest.dat");)
        {
            for (int i = 1; i <= 10; i++)
            {
                outputStream.write(i);
            }
        }

        try(FileInputStream inputStream = new FileInputStream(".\\ch17\\fileIOStreamTest.dat");)
        {
            int value = 0;
            while ((value = inputStream.read()) != -1)
            {
                System.out.println(value + " ");
            }
        }
    }
}
