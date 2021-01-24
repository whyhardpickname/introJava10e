package exercises;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 将对象和数组存储在文件中
 * @author MarkChern
 */
public class ex5
{
    public static void main(String[] args) throws IOException
    {
        int[] ints = {1, 2, 3, 4, 5};
        Date date = new Date();
        double d = 6.0;

        //创建对象输出流
        try
        (
            ObjectOutputStream objectOutput = new ObjectOutputStream(
                    new FileOutputStream("ex17_05.dat"));
        )
        {
            objectOutput.writeObject(ints);
            objectOutput.writeObject(date);
            objectOutput.writeDouble(d);
        }

    }
}
