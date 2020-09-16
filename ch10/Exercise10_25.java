import java.util.*;
public class Exercise10_25
{
	public static void main(String[] args)
	{
		String s = "abbabbabba";
		String[] a = split(s, "b");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static int[] contains(String s, String regex, int from)
	{
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		boolean match = false;
		for (int i = from; i + regex.length() - 1 < s.length(); i++)
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
				indexes.add(i);
			}
		}
		int[] arr = indexes.stream().mapToInt(k->k).toArray();
		return arr;
	}
	
	public static String[] split(String s, String regex)
	{
		int[] indexes = contains(s, regex, 0);
		if (indexes.length == 0)
		{
			return new String[] {s};
		}
		ArrayList<String> tokens = new ArrayList<String>();
		tokens.add(s.substring(0, indexes[0]));
		tokens.add(regex);
		for (int i = 1; i < indexes.length; i++)
		{
			tokens.add(s.substring(indexes[i - 1] + regex.length(), indexes[i]));
			tokens.add(regex);
		}
		tokens.add(s.substring(indexes[indexes.length - 1] + regex.length(), s.length()));
		return tokens.toArray(new String[tokens.size()]);
	}
	
	
}