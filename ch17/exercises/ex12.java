package exercises;

import java.io.*;

/**
 * 组合文件
 * @author MarkChern
 */
public class ex12
{
    public static void main(String[] args) throws IOException
    {
        //检查命令行参数
        if (args.length < 2)
        {
            System.out.println("usage: java ex10 sourceFile targetFile ");
            System.exit(1);
        }
        String targetFile = args[args.length - 1];
        int numberOfFiles = args.length;
        //使用try-resource还有bufferIO
        try(
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(targetFile, true));
        ) {
            for (int i = 0; i < numberOfFiles; i++)
            {
                try(
                BufferedInputStream in = new BufferedInputStream(
                        new FileInputStream(args[i]));
                ){
                    int value;
                    while ((value = in.read()) != -1)
                    {
                        out.write(value);
                    }
                }
            }
        }
    }

}
