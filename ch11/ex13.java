import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ex13
{
    public static void main(String[] args)
    {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())
        {
            int i = in.nextInt();
            if (!integers.contains(i))
            {
                integers.add(i);
            }
        }
        System.out.println(integers.toString());
    }
}
