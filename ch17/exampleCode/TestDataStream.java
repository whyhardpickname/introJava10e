package exampleCode;

import java.io.*;

/**
 * 使用{@code DataInputStream}将学生的姓名和分数写入temp.dat,
 * 再用{@code DataOutputStream}读取出来。
 * @author MarkChern
 */
public class TestDataStream
{
    public static void main(String[] args) throws IOException
    {
        //要创建的文件的相对地址
        String address = ".\\ch17\\exampleCode\\temp.dat";

        //写入数据
        try
        (
            FileOutputStream fileOutputStream = new FileOutputStream(address);
            //DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            //通过缓冲输出类加速文件输出
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
        )
        {
            dataOutputStream.writeUTF("mark");
            dataOutputStream.writeDouble(86.5);

            dataOutputStream.writeUTF("alice");
            dataOutputStream.writeDouble(96.5);
        }

        //读出数据并输出
        try
        (
            FileInputStream fileInputStream = new FileInputStream(address);
            //DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            //通过缓冲输入类加速文件输入
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        )
        {
            try
            {
                while (true)
                {
                    System.out.println(dataInputStream.readUTF());
                    System.out.println(dataInputStream.readDouble());
                }
            }
            catch (EOFException eofException)
            {
                System.out.println("All data were read.");
            }
        }
    }
}
