package exercise2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author MarkChern
 * date 2020/12/6 17:08
 */
public class Numbers
{
    public static void shuffle(ArrayList<Number> list)
    {
        Random random = new Random();
        for (int i = 0; i < list.size() - 1; i++)
        {
            int index = i + 1 +  random.nextInt(list.size() - i - 1);
            Number temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
    }

    public static void sort(ArrayList<Number> list)
    {
        //todo
    }
}
