package ex6;

/**
 * @author MarkChern
 * date 2020/12/10 17:09
 */
public class ComparableCircle extends Circle implements Comparable<Circle>
{
    public ComparableCircle()
    {
    }

    public ComparableCircle(double radius)
    {
        super(radius);
    }

    @Override
    public int compareTo(Circle o)
    {
        return Double.compare(this.getRadius(), o.getRadius());
    }
}
