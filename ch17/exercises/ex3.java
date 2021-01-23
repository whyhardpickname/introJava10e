package exercises;

import java.io.*;

/**
 * 创建一个文本，向文本写入随机数。
 * @author MarkChern
 */
public class ex3
{
    public static void main(String[] args) throws IOException
    {
        String address = ".//ch17//exercises//ex17_02.dat";
        //创建文本文件输入流
        try
        (
                DataInputStream input = new DataInputStream(new FileInputStream(address));
        )
        {
            //累加数
            int sum = 0;
            try
            {
                while (true)
                {
                    sum += input.readInt();
                }
            }
            catch (EOFException e)
            {
                System.out.println("sum = " + sum);
            }
        }
    }
}
