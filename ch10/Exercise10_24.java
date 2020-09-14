<<<<<<< HEAD
import java.util.*;
=======
>>>>>>> 9b9981f44623ce8d247575609cfa875fb354b74d
public class Exercise10_24
{
	public static void main(String[] args)
	{
<<<<<<< HEAD
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
=======
		MyCharacter c = new MyCharacter('a');
		MyCharacter c1 = new MyCharacter('a');
		System.out.println(c.charValue());
		System.out.println(MyCharacter.compare('a', 'b'));
		System.out.println(c.compareTo(MyCharacter.valueOf('b')));
		System.out.println(MyCharacter.digit('0'));
		System.out.println(MyCharacter.isDigit(c));
		System.out.println(MyCharacter.isAlphabetic(c));
		System.out.println(c.equals(c1));
		
		
	}		
}

class MyCharacter
{
	private char c;
	
	public MyCharacter(char c)
	{
		this.c = c;
	}
	
	public char charValue()
	{
		return c;
	}
	
	public static int compare(char x, char y)
	{
		return x - y;
	}
	
	public int compareTo(MyCharacter anotherCharacter)
	{
		return c - anotherCharacter.charValue();
	}
	
	public static int digit(char c)
	{
		return c - '0';
	}
	
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		
		if (obj == null)
		{
			return false;
		}
		
		if (getClass() != obj.getClass())
		{
			return false;
		}
		
		MyCharacter otherObj = (MyCharacter) obj;
		return c == otherObj.charValue();
	}
	
	public static boolean isAlphabetic(MyCharacter c)
	{
		return isAlphabetic(c.charValue());
	}
	
	public static boolean isAlphabetic(char c)
	{
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
			return true;
		}
		return false;
	}
	
	public static boolean isDigit(MyCharacter c)
	{
		return isDigit(c.charValue());
	}
	
	public static boolean isDigit(char c)
	{
		if (c >= '0' && c <= '9')
		{
			return true;
		}
		return false;
	}
	
	public static MyCharacter valueOf(char c)
	{
		return new MyCharacter(c);
>>>>>>> 9b9981f44623ce8d247575609cfa875fb354b74d
	}
}