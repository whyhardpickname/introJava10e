import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/10/25 13:42
 */
public class ex9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            String s = in.next();
            for (int j = 0; j < s.length(); j++)
            {
                array[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<ArrayList<Integer>> indexArray;
        indexArray = countOne(array);
        for (ArrayList<Integer> a : indexArray)
        {
            System.out.println(a.toString());
        }
    }

    public static ArrayList<ArrayList<Integer>> countOne(int[][] array)
    {
        int n = array.length;
        int[] rowOneNum = new int[n];
        int[] columnOneNum = new int[n];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < n; i++)
        {
            int counterRow = 0;
            int counterColumn = 0;

            for (int j = 0; j < n; j++)
            {
                counterRow += array[i][j];
                counterColumn += array[j][i];
            }

            rowOneNum[i] = counterRow;
            columnOneNum[i] = counterColumn;

            if (counterRow > maxRow)
            {
                maxRow = counterRow;
            }

            if (counterColumn > maxColumn)
            {
                maxColumn = counterColumn;
            }
        }

        ArrayList<Integer> rowIndex = new ArrayList<>();
        ArrayList<Integer> columnIndex = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            if (rowOneNum[i] == maxRow)
            {
                rowIndex.add(i);
            }

            if (columnOneNum[i] == maxColumn)
            {
                columnIndex.add(i);
            }
        }

        ArrayList<ArrayList<Integer>> indexArray = new ArrayList<>();
        indexArray.add(rowIndex);
        indexArray.add(columnIndex);
        return indexArray;
    }
}
