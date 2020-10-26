import java.util.ArrayList;
import java.util.Scanner;

public class ex14
{
    public static void main(String[] args)
    {
        System.out.println("Enter intergers for list1");
        Scanner in1 = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (in1.hasNext("\n"))
        {
            list1.add(in1.nextInt());
        }

        System.out.println("Enter intergers for list2");
        Scanner in2 = new Scanner(System.in);
        while (in2.hasNext("\n"))
        {
            list2.add(in2.nextInt());
        }

        System.out.println(union(list1, list2).toString());
    }

    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> list3 = new ArrayList<>();
        for (Integer i : list1)
        {
            if (!list3.contains(i))
            {
                list3.add(i);
            }
        }

        for (Integer i : list2)
        {
            if (!list3.contains(i))
            {
                list3.add(i);
            }
        }
        return list3;
    }
}
