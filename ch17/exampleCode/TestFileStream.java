package exampleCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用二进制I/O将0到9写入一个名为temp.dat中，再将其读取出来。
 * @author MarkChern
 */
public class TestFileStream
{
    public static void main(String[] args) throws IOException
    {
        //要创建的文件的相对地址
        String address = ".\\ch17\\exampleCode\\temp.dat";
        //将整数写入创建的文件
        try (
            FileOutputStream output = new FileOutputStream(address);
        ) {
            for (int i = 0; i < 10; i++)
            {
                output.write(i);
            }
        }

        //将整数从文件中读取
        try (
            FileInputStream input = new FileInputStream(address);
        ) {
            int value = 0;
            while ((value = input.read()) != -1)
            {
                System.out.print(value + " ");
            }
        }
    }
}
