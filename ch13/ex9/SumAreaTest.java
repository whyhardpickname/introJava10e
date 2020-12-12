package ex9;

/**
 * @author MarkChern
 * date 2020/12/12 16:40
 */
public class SumAreaTest
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(1);

        Rectangle rectangle1 = new Rectangle(1, 1);
        Rectangle rectangle2 = new Rectangle(1, 1);

        GeometricObject[] geometricObjects = new GeometricObject[4];

        geometricObjects[0] = circle1;
        geometricObjects[1] = circle2;
        geometricObjects[2] = rectangle1;
        geometricObjects[3] = rectangle2;

        System.out.println(GeometricObject.sumArea(geometricObjects));
        System.out.println(2 + 2 * Math.PI);
    }
}
