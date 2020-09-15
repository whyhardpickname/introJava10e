import java.util.*;
//to do
public class Exercise10_25
{
	public static void main(String[] args)
	{
		String s = "ababab";
		String[] a = split(s, "b");
		System.out.println(contains(s, "b", 4));
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	public static String[] split(String s, String regex)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		int i = 0;
		while (i < s.length())
		{
			int j = contains(s, regex, i);
			System.out.printf("%d %d\n", i, j);
			if (j >= 0)
			{
				result.add(s.substring(i, j));
				result.add(regex);
			}
			else
			{
				result.add(s.substring(i, s.length()));
				return result.toArray(new String[result.size()]);
			}
			i = j + regex.length();
		}
		return result.toArray(new String[result.size()]);
	}		
	
	public static int contains(String s, String regex, int from)
	{
		if (regex.length() == 0)
		{
			return from + 1;
		}
		
		boolean match = false;
		for (int i = from; i + regex.length() < s.length(); i++)
		{
			match = true;
			for (int j = 0; j < regex.length(); j++)
			{
				if (Character.compare(s.charAt(i + j), regex.charAt(j)) != 0)
				{
					match = false;
				}
			}
			if (match)
			{
				return i;
			}
		}
		return -1;
	}
}