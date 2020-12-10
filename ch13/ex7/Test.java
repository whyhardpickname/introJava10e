package ex7;

/**
 * @author MarkChern
 * date 2020/12/10 17:15
 */
public class Test
{
    public static void main(String[] args)
    {
        Square square = new Square();
        Object o = new Object();

        if (square instanceof Colorable)
        {
            square.howToColor();
        }

        if (o instanceof  Colorable)
        {
            System.out.println("not be able to color");
        }
    }
}
