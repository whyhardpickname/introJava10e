package exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/12/1 16:20
 */
public class ex31
{
    public static void main(String[] args) throws IOException
    {
        int year = 2020;
        String gender = "M";
        String name = "Bob";
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the year: ");
        year = read.nextInt();

        System.out.print("Enter the gender: ");
        gender = read.next();

        System.out.print("Enter the name: ");
        name = read.next();

        if (rank(year, gender, name) > 0)
        {
            System.out.println(name + " is ranked #" + rank(year, gender, name) + " in year " + year);
        }
        else
        {
            System.out.println(name + " is not ranked" + " in year " + year);
        }
    }

    public static int rank(int year, String gender, String name) throws IOException
    {
        File names = new File(".\\names");
        File[] years = names.listFiles();

        int count = 0;
        for (File f : years)
        {
            if (f.getName().contains(String.valueOf(year)))
            {
                Scanner read = new Scanner(f);
                while (read.hasNextLine())
                {
                    count++;
                    String line = read.nextLine();
                    if (line.contains(gender) && line.contains(name))
                    {
                        return count;
                    }
                }
            }
        }
        return -1;
    }
}
