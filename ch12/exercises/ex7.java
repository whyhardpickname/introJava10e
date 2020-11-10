package exercises;

public class ex7
{
    public static void main(String[] args)
    {
        System.out.println(bin2Dec("1111"));
    }

    public static int bin2Dec(String binaryString)
    {
        int sum = 0;
        int weight = 1;
        int length = binaryString.length();
        for (int i = 0; i < length; i++)
        {
            sum += bit2Dec(binaryString.charAt(length - 1 - i)) * weight;
            weight *= 2;
        }
        return sum;
    }

    public static int bit2Dec(char bit)
    {
        if (Character.compare(bit, '0') != 0 && Character.compare(bit, '1') != 0)
        {
            throw new NumberFormatException("Invalid bit: " + bit);
        }
        return bit - '0';
    }
}
