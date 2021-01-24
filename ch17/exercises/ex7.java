package exercises;

import java.io.*;

/**
 * @author MarkChern
 */
public class ex7
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        //创建输出流
        try
        (
            ObjectInputStream inputStream = new ObjectInputStream(
                    new FileInputStream("ex17_06.dat"));
        )
        {
            try
            {
                while (true)
                {
                    System.out.println(inputStream.readObject());
                }
            }
            catch (EOFException e)
            {
                System.out.println("reach the end of file");
            }
        }
    }
}
