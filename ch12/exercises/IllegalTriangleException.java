package exercises;

public class IllegalTriangleException extends IllegalArgumentException
{
    public IllegalTriangleException()
    {
        super("The sum of any two sides is greater than the third");
    }
}
