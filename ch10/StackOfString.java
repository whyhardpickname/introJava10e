public class StackOfString
{
	private String[] elments;
	private int size;
	
	public static final int DEFAULT_CAPCITY = 10;
	
	public StackOfString()
	{
		this(DEFAULT_CAPCITY);
	}
	
	public StackOfString(int capacity)
	{
		elments = new String[capacity];
	}
	
	public String peek()
	{
		if (size == 0)
		{
			return "";
		}
		return elments[size - 1];
	}
	
	public void push(String value)
	{
		if (size >= elments.length)
		{
			String[] temp = new String[elments.length * 2];
			System.arraycopy(elments, 0, temp, 0, elments.length);
			elments = temp;
		}
		
		elments[size++] = value;
		
	}
	
	public String pop()
	{
		return elments[--size];
	}
	
	public int getSize()
	{
		return size;
	}
	
	public static void main(String[] args)
	{
		StackOfString s = new StackOfString();
		s.push("a");
		s.push("b");
		System.out.println(s.pop());
	}
}