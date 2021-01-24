package exercises;

import javax.xml.transform.Source;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Formatter;

/**
 * 利用一个文本文件生成另一个二进制文件
 * @author MarkChern
 */
public class ex4
{
    public static void main(String[] args) throws IOException
    {
        //检查命令行参数
        if (args.length != 2)
        {
            System.out.println("Usage: java ex4 example.java example.utf");
            System.exit(1);
        }

        //检查文本文件是否存在
        File text = new File(args[0]);
        if (!text.exists())
        {
            System.out.println("The text file doesn't exits.");
            System.exit(2);
        }

        //检查保存输出的二进制文件是否存在
        File binaryFile = new File(args[1]);
        if (binaryFile.exists())
        {
            System.out.println("The output file already exits。");
            System.exit(3);
        }

        //创建输入输出流
        try
        (
            BufferedReader input = new BufferedReader(new FileReader(text));
            DataOutputStream output = new DataOutputStream(new FileOutputStream(binaryFile));
        )
        {
            String line;
            while ((line = input.readLine()) != null)
            output.writeUTF(line);
        }

        //输出文件大小
        try
        (
            InputStream inputStream1 = new FileInputStream(text);
            InputStream inputStream2 = new FileInputStream(binaryFile);
        )
        {
            System.out.println(text + "has" + inputStream1.available() + " bytes.");
            System.out.println(binaryFile + "has" + inputStream2.available() + " bytes.");
        }

    }
}
