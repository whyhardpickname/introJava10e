package exampleCode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * todo
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
        try (
            FileOutputStream fileOutputStream = new FileOutputStream(address);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        ) {

        }
    }
}
