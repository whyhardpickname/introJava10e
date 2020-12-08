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
        quicksort(list, 0, list.size() - 1);
    }

    public static void quicksort(ArrayList<Number> list, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(list, 0, list.size() - 1);
            quicksort(list, left, pivot - 1);
            quicksort(list,pivot + 1, right);
        }
    }
    public static int partition(ArrayList<Number> list, int left, int right)
    {
        int pivot = left;
        swap(list, pivot, right);

        int store = left;

        BigDecimal pivotValue = new BigDecimal(list.get(right).toString());
        for (int i = 0; i < right; i++)
        {
            if (new BigDecimal(list.get(i).toString()).compareTo(pivotValue) < 0)
            {
                swap(list, i, store);
                store++;
            }
        }
        swap(list, store, right);
        return store;
    }

    public static void swap(ArrayList<Number> list, int i, int j)
    {
        Number temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
