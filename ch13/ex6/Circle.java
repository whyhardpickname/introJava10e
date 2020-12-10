package ex6;

/**
 * @author MarkChern
 * date 2020/12/10 17:07
 */
public class Circle
{
    private double radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
