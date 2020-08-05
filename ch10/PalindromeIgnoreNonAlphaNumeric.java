import java.util.Scanner;

public class PalindromeIgnoreNonAlphaNumeric
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(isPalindrome(input));
	}
		
	public static boolean isPalindrome(String s)
	{
		String filted = filter(s);
		String reversed = reverse(filted);
		return reversed.equals(filted);
	}
	
	public static String filter(String s)
	{
		StringBuilder filted = new StringBuilder();
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isLetterOrDigit(s.charAt(i)))
			{
				filted.append(s.charAt(i));
			}
		}
		return filted.toString();
	}
	
	public static String reverse(String s)
	{
		StringBuilder reversed = new StringBuilder(s);
		reversed.reverse();
		return reversed.toString();	
	}
}