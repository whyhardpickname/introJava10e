/**
 * @author MarkChern
 */
public class fibTailRecursion
{
    public static void main(String[] args)
    {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
    }

    public static int fib(int n)
    {
        return fib(n, 0, 1);
    }

    public static int fib(int n, int a, int b)
    {
        if (n == 0)
        {
            return a;
        }
        else if (n == 1)
        {
            return b;
        }
        else
        {
            return fib(n - 1, b, a + b);
        }
    }
}
