package exercises;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Format;
import java.util.Formatter;
import java.util.Random;

/**
 * 创建一个文本，向文本写入随机数。
 * @author MarkChern
 */
public class ex1
{
    public static void main(String[] args) throws IOException
    {
        String address = ".//ch17//exercises//ex17_01.txt";
        //创建文本文件输出流
        try
        (
            Formatter output = new Formatter(new FileOutputStream(address, true));
        )
        {
            //输入随机数
            Random random = new Random();
            for (int i = 0; i < 100; i++)
            {
                output.format("%d ", random.nextInt());
            }
        }
    }
}
