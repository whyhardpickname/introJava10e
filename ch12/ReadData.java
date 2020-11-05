import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("Scores.txt");

        try (Scanner scanner = new Scanner(file);)
        {
            while (scanner.hasNext())
            {
                String s = scanner.next();
                int i = scanner.nextInt();
                System.out.println(s + " " + i);
            }
        }
    }
}
