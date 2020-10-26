import java.util.ArrayList;
import java.util.Scanner;

public class ex12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        int i = 0;
        while (i < 5)
        {
            list.add(in.nextDouble());
            i++;
        }
        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list)
    {
        double total = 0;
        for (Double d : list)
        {
            total += d;
        }
        return total;
    }
}
