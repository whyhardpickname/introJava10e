package exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ex13
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\ex12.java");
        Scanner in = new Scanner(file);
        int rows = 0;
        int words = 0;
        int characters = 0;
        while (in.hasNextLine())
        {
            String line =  in.nextLine();
            String[] array = line.split("\\s+");
            words += array.length;
            for (int i = 0; i < array.length; i++)
            {
                characters += array[i].length();
            }
            rows++;
        }
        System.out.println("rows: " + rows);
        System.out.println("words: " + words);
        System.out.println("characters: " + characters);
    }
}
