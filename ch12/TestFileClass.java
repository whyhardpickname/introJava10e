import java.io.File;

/**
 * @author MarkChern
 * date 2020/11/1 15:38
 */
public class TestFileClass
{
    public static void main(String[] args)
    {
        File file = new File("ch12/test");
        System.out.println(file.exists());
        System.out.println(file.length());
    }
}
