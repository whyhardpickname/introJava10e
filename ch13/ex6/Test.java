package ex6;

/**
 * @author MarkChern
 * date 2020/12/10 17:10
 */
public class Test
{
    public static void main(String[] args)
    {
        ComparableCircle c1 = new ComparableCircle(1);
        ComparableCircle c2 = new ComparableCircle(2);

        System.out.println(c1.compareTo(c2));
    }
}
