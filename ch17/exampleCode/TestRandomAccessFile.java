package exampleCode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * {@code TestRandomAccessFile}创建一个test.dat文件。文件如果存在，清除原有内容。
 * 将大量数字写入，并读取，写入和修改其中数字。
 * @author MarkChern
 */
public class TestRandomAccessFile
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //创建RandomAccessFile对象，模式可读写,使用try-with-resource
        try
        (
            RandomAccessFile inout = new RandomAccessFile("test.dat", "rw");
        )
        {
            //文件清零
            inout.setLength(0);

            //写入数字
            for (int i = 0; i < 100; i++)
            {
                inout.writeInt(i);
            }

            //打印当前文件长度
            System.out.println("The length of the file is " + inout.length() + " bytes.");

            //打印第一个数字
            inout.seek(0);
            System.out.println("The first number is " + inout.readInt());

            //打印第二个数字
            inout.seek(4);
            System.out.println("The second number is " + inout.readInt());

            //打印第十个数字
            inout.seek(9 * 4);
            System.out.println("The tenth number is " + inout.readInt());

            //修改第十一个数字
            inout.seek(10 * 4);
            inout.writeInt(1111);

            //插入一个数字，指针后移4个字节，因为int类型4字节
            inout.seek(inout.length());
            inout.writeInt(2222);

            //打印第十一个数字
            inout.seek(10 * 4);
            System.out.println("The eleventh number is " + inout.readInt());

            //打印最后一个数字,-4因为一个数字4字节
            inout.seek(inout.length() - 4);
            System.out.println("The last number is " + inout.readInt());

            //打印当前文件长度
            System.out.println("The length of the file is " + inout.length() + " bytes.");
        }
    }
}
