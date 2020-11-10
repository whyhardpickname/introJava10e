package exercises;

import java.util.Arrays;

public class ex6
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(hexToDec("q1"));
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static int hexToDec(String hexString)
    {
        int sum = 0;
        int weight = 1;
        int length = hexString.length();
        for (int i = 0; i < length; i++)
        {
            int num = hexLetterToDec(hexString.charAt(length - 1 - i));
            sum += num * weight;
            weight *= 16;
        }
        return sum;
    }

    public static int hexLetterToDec(char letter) throws NumberFormatException
    {
        if (Character.isDigit(letter))
        {
            return letter - '0';
        }

        String uppercaseLetter = String.valueOf(Character.toUpperCase(letter));
        String hexLetters = "ABCDEF";
        if (!hexLetters.contains(uppercaseLetter))
        {
            throw new NumberFormatException("Invalid hex character: " + letter);
        }

        return Character.toUpperCase(letter) - 'A' + 10;
    }
}
