package exercisesCode;

public class BinaryFormatException extends NumberFormatException
{
    public BinaryFormatException()
    {
        super("invalid binary format");
    }

    public BinaryFormatException(String massage)
    {
        super(massage);
    }
}
