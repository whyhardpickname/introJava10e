package exercisesCode;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/25 16:38
 */
public class ex19
{
    public static void main(String[] args) throws Exception
    {
        String website = "http://cs.armstrong.edu/liang/data/Linconln.txt";
        try
        {
            URL url = new URL(website);
            int words = 0;
            try (Scanner in = new Scanner(url.openStream()))
            {
                while (in.hasNext())
                {
                    String word = in.next();
                    if (word.trim().length() > 0)
                    {
                        words++;
                    }
                }
                System.out.println("words: " + words);
            }
        } catch (MalformedURLException e1)
        {
            System.out.println("invalid url");
        } catch (IOException e2)
        {
            System.out.println("no such file");
        }
    }
}
