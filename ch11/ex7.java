import java.util.ArrayList;
import java.util.Random;

public class ex7
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add(i);
        }

        shuffle(list);
        for (Integer i : list)
        {
            System.out.print(i + " ");
        }
    }

    public static void shuffle(ArrayList<Integer> list)
    {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++)
        {
            int n = random.nextInt(list.size() - i)  + i;
            int temp = list.get(i);
            list.set(i, list.get(n));
            list.set(n, temp);
        }
    }
}
