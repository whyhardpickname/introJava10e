import java.util.*;
public class Exercise10_24
{
	public static void main(String[] args)
	{
		String s = "axxbyc";
		String[] a = split(s, "");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	public static String[] split(String s, String regex)
	{
		ArrayList<String> result = new ArrayList<String>();
		if (regex.length() == 0)
		{
			result.add(s.substring(0, 1));
			for (int i = 1; i < s.length(); i++)
			{
				result.add(regex);
				result.add(s.substring(i, i + 1));
			}
		}
		return result.toArray(new String[result.size()]);
		
		//todo
	}
}