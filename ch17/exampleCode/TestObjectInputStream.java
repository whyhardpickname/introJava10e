package exampleCode;

import java.io.*;
import java.util.Date;

/**
 * @author MarkChern
 */
public class TestObjectInputStream
{
    public static void main(String[] args) throws ClassNotFoundException, IOException
    {
        String address = ".\\ch17\\exampleCode\\temp.dat";
        //创建ObjectInputStream对象
        try
        (
            //使用buffer提高性能
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new BufferedInputStream(new FileInputStream(address)));
        )
        {
            //读取分数，姓名和日期
            Double score = objectInputStream.readDouble();
            String name = objectInputStream.readUTF();
            Date date = (Date) objectInputStream.readObject();
            System.out.println(name + " " + score + " " + date);
        }
    }
}
