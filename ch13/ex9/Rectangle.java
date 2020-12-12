package ex9;

import java.util.Objects;

/**
 * @author MarkChern
 * date 2020/12/10 16:46
 */
public class Rectangle extends ex9.GeometricObject
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(width, height);
    }
}
