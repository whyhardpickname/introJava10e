/**
 * @author MarkChern
 * date 2020/11/1 15:04
 */
public class InvalidRadiusException extends Exception
{
    private double radius;

    public InvalidRadiusException(double radius)
    {
        super("InvalidRadiusException: " + radius);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }
}
