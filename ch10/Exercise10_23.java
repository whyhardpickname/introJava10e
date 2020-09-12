import java.lang.Character;

public class Exercise10_23
{
	public static void main(String[] args)
	{
		MyString2 s = new MyString2("abc");
		System.out.println(s.compare("ab"));
		System.out.println(s.compare("abc"));
		System.out.println(s.compare("abcd"));
		System.out.println(s.substring(1).charAt(0));
		System.out.println(MyString2.valueOf(true).charAt(0));
		System.out.println(MyString2.valueOf(false).charAt(0));
	}		
}

class MyString2
{
	private char[] string;
	
	public MyString2(String s)
	{
		string = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
		{
			string[i] = s.charAt(i);
		}
	}
	
	public char charAt(int index)
	{
		return string[index];
	}
	
	public int length()
	{
		return string.length;
	}
	
	public int compare(String s)
	{
		int min = Math.min(this.length(), s.length());
		for (int i = 0; i < min; i++)
		{
			if (Character.compare(string[i], s.charAt(i)) > 0)
			{
				return 1;
			}
			else if (Character.compare(string[i], s.charAt(i)) < 0)
			{
				return -1;
			}
		}
		if (this.length() > s.length())
		{
			return 1;
		}
		else if (this.length() < s.length())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public MyString2 substring(int begin)
	{
		if (begin >= this.length())
		{
			return new MyString2("");
		}
		char[] substring  = new char[this.length() - begin];
		for (int i = begin; i < this.length(); i++)
		{
			substring[i - begin] = string[i];
		}
		return new MyString2(substring.toString());
	}
	public MyString2 toUpperCase()
	{
		char[] upperCaseString = new char[this.length()];
		for (int i = 0; i < this.length(); i++)
		{
			upperCaseString[i] = Character.toUpperCase(string[i]);
		}
		return new MyString2(upperCaseString.toString());
	}
	
	public char[] toChars()
	{
		return string;
	}
	
	public boolean equals(MyString2 s)
	{
		if (this == s)
		{
			return true;
		}
		if (s.length() != this.length())
		{
			return false;
		}
		for (int i = 0; i < this.length(); i++)
		{
			if (Character.compare(s.charAt(i), this.charAt(i)) != 0)
			{
				return false;
			}
		}
		return true;
	}
	public static MyString2 valueOf(boolean b)
	{
		if (b == true)
		{
			return new MyString2("true");
		}
		else
		{
			return new MyString2("false");
		}
	}
}