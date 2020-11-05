import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("scores.txt");
        if (file.exists())
        {
            System.out.println("File is already exists.");
            System.exit(1);
        }
        try (PrintWriter printWriter = new PrintWriter("scores.txt");)
        {
            printWriter.println("alice 89");
            printWriter.println("bob 88");
        }
    }
}
