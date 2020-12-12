package ex9;

import java.util.Objects;

/**
 * @author MarkChern
 * date 2020/12/10 16:43
 */
public class Circle extends ex9.GeometricObject
{
    private double radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Object o)
    {
        Circle other = (Circle) o;
        return Double.compare(radius, other.getRadius());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(radius);
    }
}
