public class MyStringBuilder
{
	private char[] chars;
	private int size;
	private int capacity;

	public MyStringBuilder(String s)
	{

	}
	public MyStringBuilder()
	{
		size = 0;
		capacity = 16;
		chars = new char[capacity];
	}
	public MyStringBuilder(char[] chars)
	{

	}
	public MyStringBuilder append(MyStringBuilder s)
	{
		return null;
	}
	public MyStringBuilder append(int i)
	{
		return null;
	}
	public MyStringBuilder insert(int offset, MyStringBuilder s)
	{
		return null;
	}
	public MyStringBuilder reverse()
	{
		return null;
	}
	public int length()
	{
		return size;
	}
	public char charAt(int index)
	{
		return ' ';
	}
	public MyStringBuilder toLowerCase()
	{
		return null;
	}
	public MyStringBuilder toUpperCase()
	{
		return null;
	}
	public MyStringBuilder substring(int begin, int end)
	{
		return null;
	}
	public String toString()
	{
		return null;
	}

	public static void main(String[] args)
	{
		MyStringBuilder mysb = new MyStringBuilder();
		System.out.println(mysb.length());
	}
}