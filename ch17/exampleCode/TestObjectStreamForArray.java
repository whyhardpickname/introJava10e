package exampleCode;

import javax.xml.transform.Source;
import java.io.*;
import java.sql.SQLOutput;

/**
 * {@code TestObjectStreamForArray}将一个整数数组和一个字符串数组存入array.dat,
 * 随后取出打印两个数组内容。
 * @author MarkChern
 */
public class TestObjectStreamForArray
{
    public static void main(String[] args) throws ClassNotFoundException, IOException
    {
        //创建Object输出流，使用try-with-resource自动关闭文件
        try
        (
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("array.dat", true));
        )
        {
            //创建数组，写入文件
            int[] ints = {1, 2, 3};
            String[] strings = {"a", "b", "c"};

            objectOutputStream.writeObject(ints);
            objectOutputStream.writeObject(strings);
        }
        //创建Object输入流
        try
        (
            ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("array.dat"));
        )
        {
            int[] ints = (int[]) objectInputStream.readObject();
            String[] strings = (String[]) objectInputStream.readObject();

            //打印数组
            for (int i : ints)
            {
                System.out.print(i + " ");
            }

            System.out.println();

            for (String s : strings)
            {
                System.out.print(s + " ");
            }
        }
    }
}
