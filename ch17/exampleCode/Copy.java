package exampleCode;

import sun.plugin2.os.windows.FLASHWINFO;

import javax.xml.transform.Source;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;

/**
 * {@code copy}将源文件复制到目标文件,然后显示这个文件的字节数。
 *
 * <p>如果源文件不存在或者目标文件已存在，程序给用户相应的提醒。
 *
 * @author MarkChern
 */

public class Copy
{
    /**
     *
     * @param args
     *      args[0]是源文件，ags[1]是目标文件
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        //读取命令行中源文件和目标文件名
        if (args.length != 2)
        {
            System.out.println("Usage: java Copy source target");
            System.exit(1);
        }

        //检测源文件是否存在
        File source = new File(args[0]);
        if (!source.exists())
        {
            System.out.println("Source file: " + source + "doesn't exist.");
            System.exit(2);
        }

        //检查目标是否已经存在
        File target = new File(args[1]);
        if (target.exists())
        {
            System.out.println("Target file: " + target + "already exists.");
            System.exit(3);
        }

        //创建源文件和目标文件的bufferedIO对象
        try
        (
            //源文件缓冲输入对象
            BufferedInputStream BufferedInput =
                    new BufferedInputStream(new FileInputStream(source));

            //目标文件缓冲输出对象
            BufferedOutputStream bufferedOutput =
                    new BufferedOutputStream(new FileOutputStream(target));
        )
        {
            int r;
            int bytes = 0;
            while ((r = BufferedInput.read()) != -1)
            {
                bufferedOutput.write(r);
                bytes++;
            }
            System.out.println(bytes + " bytes copies.");
        }
    }
}
