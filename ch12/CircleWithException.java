/**
 * @author MarkChern
 * date 2020/10/31 14:39
 */
public class CircleWithException
{
    private double radius;
    private static int id = 0;

    public CircleWithException() throws InvalidRadiusException
    {
        radius = 1;
    }

    public CircleWithException(double radius) throws InvalidRadiusException
    {
        setRadius(radius);
        id++;
    }

    public void setRadius(double radius) throws InvalidRadiusException
    {
        if (radius >= 0)
        {
            this.radius = radius;
        }
        else
        {
            throw new InvalidRadiusException(radius);
        }
    }

    public static int getId()
    {
        return id;
    }

    public static void main(String[] args)
    {
        try
        {
            CircleWithException c1 = new CircleWithException(1);
            CircleWithException c2 = new CircleWithException(-1);
            CircleWithException c3 = new CircleWithException(2);
        }
        catch (InvalidRadiusException argEx)
        {
            System.out.println(argEx);
        }
    }
}
