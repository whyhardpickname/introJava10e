package exercisesCode;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author MarkChern
 * date 2020/11/29 16:50
 */
public class ex30
{
    public static void main(String[] args) throws IOException
    {
        int maxLetterASCII = 123; //'z' ascii 122
        int[] charCount = new int[maxLetterASCII];

        File file = new File(".\\ch12\\exercises\\ex30.java");
        FileReader in = new FileReader(file);
        int c;
        while ((c = in.read()) != -1)
        {
            if (c < maxLetterASCII)
            {
                charCount[c]++;
            }
        }

        for (int i = 0; i < maxLetterASCII; i++)
        {
            if (Character.isAlphabetic((char) i))
            {
                System.out.printf("%d %c %d\n", i, i, charCount[i]);
            }
        }
    }
}
