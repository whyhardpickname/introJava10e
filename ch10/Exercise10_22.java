import java.lang.Character;
;

public class Exercise10_22
{
	public static void main(String[] args)
	{
		char[] chars = {'a', 'B', 'c'};
		char[] chars2 = {'a', 'B', 'c'};
		MyString1 str = new MyString1(chars);
		MyString1 str2 = new MyString1(chars2);
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println(str.substring(0, 2).charAt(1));
		System.out.println(str.toLowerCase().charAt(1));
		System.out.println(str.equals(str2));
		System.out.println(MyString1.valueOf(-123).charAt(0));
	}		
}

class MyString1
{
	private char[] string;
	
	public MyString1(char[] chars)
	{
		string = new char[chars.length];
		for (int i = 0; i < chars.length; i++)
		{
			string[i] = chars[i];
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
	
	public MyString1 substring(int begin, int end)
	{
		char[] substring  = new char[end - begin];
		for (int i = begin; i < end; i++)
		{
			substring[i] = string[i];
		}
		return new MyString1(substring);
	}
	public MyString1 toLowerCase()
	{
		char[] lowerCaseString = new char[length()];
		for (int i = 0; i < length(); i++)
		{
			lowerCaseString[i] = Character.toLowerCase(string[i]);
		}
		return new MyString1(lowerCaseString);
	}
	
	public boolean equals(MyString1 s)
	{
		if (this == s)
		{
			return true;
		}
		if (s.length() != this.length())
		{
			return false;
		}
		for (int i = 0; i < length(); i++)
		{
			if (Character.compare(s.charAt(i), this.charAt(i)) != 0)
			{
				return false;
			}
		}
		return true;
	}
	public static MyString1 valueOf(int i)
	{
		int sign = 1;
		int count = 0;
		if (i < 0)
		{
			sign = -1;
		}
		int temp = Math.abs(i);
		while (temp > 0)
		{
			temp /= 10;
			count++;
		}
		if (sign < 0)
		{
			count++;
		}
		char[] string = new char[count];
		temp = Math.abs(i);
		int j = count - 1;
		if (sign < 0)
		{
			string[0] = '-';
		}
		while (temp > 0)
		{
			int digit = temp % 10;
			temp /= 10;
			string[j] = (char) (digit + '0');
			j--;
		}
		return new MyString1(string);
	}
}