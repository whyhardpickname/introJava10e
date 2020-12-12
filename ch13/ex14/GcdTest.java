package ex14;

/**
 * @author MarkChern
 * date 2020/12/12 17:16
 */
public class GcdTest
{
    public static int gcd(int a, int b)
    {
        if (a % b == 0)
        {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args)
    {
        System.out.println(GcdTest.gcd(2,4));
        System.out.println(GcdTest.gcd(4,2));
    }
}
