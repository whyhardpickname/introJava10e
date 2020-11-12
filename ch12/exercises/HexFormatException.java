package exercises;

public class HexFormatException extends NumberFormatException
{
    public HexFormatException()
    {
        super("Invalid hex format strng");
    }

    public HexFormatException(String meassage)
    {
        super(meassage);
    }
}
