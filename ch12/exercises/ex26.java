package exercises;

import java.io.File;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/28 16:40
 */
public class ex26
{
    public static void main(String[] args)
    {
        System.out.print("输入要创建的文件夹名称： ");
        Scanner in = new Scanner(System.in);
        File file = new File(in.next());
        if (file.exists())
        {
            System.out.println("file is already exits.");
            System.exit(1);
        }

        file.mkdirs();
    }
}
