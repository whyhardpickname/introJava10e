package exercisesCode;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/12/1 16:59
 */
public class ex32
{
    public static void main(String[] args) throws IOException
    {
        File names = new File(".\\names");
        File[] years = names.listFiles();
        int rank = 5;

        System.out.printf("%15s %10s %10s %10s %10s %10s\n", "year", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
        for (File f : years)
        {
            Scanner read = new Scanner(f);
            String[] firstFive = new String[rank];
            for (int i = 0; i < rank; i++)
            {
                String line = read.nextLine();
                firstFive[i] = line.split(",")[0];
            }
            System.out.print(f.getName() + " ");
            for (int i = 0; i < rank; i++)
            {
                System.out.printf("%10s", firstFive[i]);
            }
            System.out.println();
        }
    }

}
