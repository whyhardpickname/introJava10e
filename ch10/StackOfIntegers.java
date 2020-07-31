public class StackOfIntegers
{
	private int[] elments;
	private int size;
	
	public static final int DEFAULT_CAPCITY = 10;
	
	public StackOfIntegers()
	{
		this(DEFAULT_CAPCITY);
	}
	
	public StackOfIntegers(int capacity)
	{
		elments = new int[capacity];
	}
	
	public int peek()
	{
		return elments[size - 1];
	}
	
	public void push(int value)
	{
		if (size >= elments.length)
		{
			int[] temp = new int[elments.length * 2];
			System.arraycopy(elments, 0, temp, 0, elments.length);
			elments = temp;
		}
		
		elments[size++] = value;
		
	}
	
	public int pop()
	{
		return elments[--size];
	}
	
	public int getSize()
	{
		return size;
	}
}