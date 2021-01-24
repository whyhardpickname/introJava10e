package exercises;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 更新计数器
 * @author MarkChern
 */
public class ex8
{
    public static void main(String[] args) throws IOException
    {
        //创建随机访问文件
        try
        (
            RandomAccessFile randomAccessFile = new RandomAccessFile("ex17_08.dat", "rw")
        )
        {
            int counter = 0;
            if (randomAccessFile.length() > 0)
            {
                counter = randomAccessFile.readInt();
            }
            randomAccessFile.seek(0);
            randomAccessFile.writeInt(++counter);
            System.out.println("current counter is " + counter);
        }
    }
}
