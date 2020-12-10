package ex5;

/**
 * @author MarkChern
 * date 2020/12/10 16:46
 */
public class Rectangle extends GeometricObject
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width)
    {
        super(color, filled);
        this.width = width;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Object o)
    {
        Rectangle other = (Rectangle) o;
        return Double.compare(getArea(), other.getArea());
    }
}
