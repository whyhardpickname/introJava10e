package exercises;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Formatter;
import java.util.Random;

/**
 * 创建一个文本，向文本写入随机数。
 * @author MarkChern
 */
public class ex2
{
    public static void main(String[] args) throws IOException
    {
        String address = ".//ch17//exercises//ex17_02.dat";
        //创建文本文件输出流
        try
        (
            DataOutputStream output = new DataOutputStream(new FileOutputStream(address, true));
        )
        {
            //输入数
            for (int i = 1; i <= 100; i++)
            {
                output.writeInt(i);
            }
        }
    }
}
