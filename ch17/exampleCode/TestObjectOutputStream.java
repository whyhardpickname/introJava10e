package exampleCode;

import java.io.*;
import java.util.Date;

/**
 * 将学生的姓名，分数和当前日期写到temp.dat中
 * @author MarkChern
 */
public class TestObjectOutputStream
{
    public static void main(String[] args) throws IOException
    {
        String address = ".\\ch17\\exampleCode\\temp.dat";
        //创建ObjectOutputStream对象
        try
        (
            //使用buffer提高性能
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(address)));
        )
        {
            //输入分数，姓名和日期
            objectOutputStream.writeDouble(89.3);
            objectOutputStream.writeUTF("mark");
            objectOutputStream.writeObject(new Date());
        }
    }
}
