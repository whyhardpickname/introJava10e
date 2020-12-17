package ex17;

/**
 * @author MarkChern
 * date 2020/12/17 17:05
 */
public class ComplexTest
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex(3.5,5.5);
        Complex c2 = new Complex(-3.5, 1);

        System.out.println(c1.add(c2));
        System.out.println(c1.subtract(c2));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.divide(c2));
        System.out.println(c1.abs());

    }
}
