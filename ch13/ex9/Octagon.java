package ex9;

/**
 * @author MarkChern
 * date 2020/12/12 16:29
 */
public class Octagon extends ex9.GeometricObject implements Cloneable
{
    private double side;

    public Octagon(double side)
    {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side)
    {
        super(color, filled);
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter()
    {
        return 8 * side;
    }

    @Override
    public int compareTo(Object o)
    {
        Octagon other = (Octagon) o;
        return Double.compare(other.getSide(), other.getSide());
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException
    {
        return (Octagon) super.clone();
    }
}
