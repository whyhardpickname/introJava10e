package ex20;

/**
 * @author MarkChern
 * date 2020/12/22 16:21
 */
public class QuadraticEquation
{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Complex[] root()
    {
        Complex roots[] = new Complex[2];
        double delta = b * b - 4 * a * c;
        if (delta >= 0)
        {
            roots[0] = new Complex((-b + Math.sqrt(delta)) / (2 * a));
            roots[1] = new Complex((-b - Math.sqrt(delta)) / (2 * a));
        }
        else
        {
            roots[0] = new Complex(-b / (2 * a), Math.sqrt(-delta) / (2 * a));
            roots[1] = new Complex(-b / (2 * a), Math.sqrt(-delta) / (-2 * a));
        }
        return roots;
    }

    public static void main(String[] args)
    {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 3);
        for (Complex c : equation.root())
        {
            System.out.println(c);
        }
    }
}
