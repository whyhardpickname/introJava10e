package ex5;

/**
 * @author MarkChern
 * date 2020/12/10 16:49
 */
public class Test
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);

        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2 = new Rectangle(3, 4);

        System.out.println("circle: ");
        System.out.println(GeometricObject.compare(c1, c2));
        System.out.println(c1.compareTo(c2));

        System.out.println("rectangle: ");
        System.out.println(GeometricObject.compare(r1, r2));
        System.out.println(r1.compareTo(r2));
    }
}
