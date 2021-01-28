package exercises;

import java.io.*;

/**
 * 分割文件
 * @author MarkChern
 */
public class ex10
{
    public static void main(String[] args) throws IOException
    {
        //检查命令行参数
        if (args.length != 2)
        {
            System.out.println("usage: java ex10 sourceFile numberOfPieces");
            System.exit(1);
        }
        String sourceFile = args[0];
        int numberOfPieces = Integer.parseInt(args[1]);
        //使用try-resource还有bufferIO
        try(
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(sourceFile));
        ) {
            long fileSize = in.available();
            int splitFileSize = (int) Math.ceil(1.0 * fileSize / numberOfPieces);

            for (int i = 1; i <= numberOfPieces; i++)
            {
                try(
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(sourceFile + "." + i));
                ){
                    int value = 0;
                    int count = 0;
                    //条件测试顺序不能对调，否则读取后，count = splitFileSize式，
                    //条件失败，当前读的字节被下一次覆盖。导致文件缺失某些字节。
                    while (count++ < splitFileSize && (value = in.read()) != -1)
                    {
                        out.write(value);
                    }
                }
            }
        }
    }

}
