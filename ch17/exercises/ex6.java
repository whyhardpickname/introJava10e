package exercises;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author MarkChern
 */
public class ex6
{
    public static void main(String[] args) throws IOException
    {
        Loan loan = new Loan();
        //创建对象输出流
        try
        (
            ObjectOutputStream objectOutput = new ObjectOutputStream(
                    new FileOutputStream("ex17_06.dat"));
        )
        {
            objectOutput.writeObject(loan);
        }
    }
}
