import java.util.Arrays;

public class Exercise10_10
{
	public static void main(String[] args)
	{
		Queue queue = new Queue();
		for (int i = 0; i < 10; i++)
		{
			queue.enqueue(i);
		}
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(queue.dequeue());
		}
		System.out.println(queue.dequeue());
	}
}

class Queue
{
	private int[] elements;
	private int size;
	
	public Queue()
	{
		elements = new int[8];
		this.size = 0;
	}
	
	public void enqueue(int v)
	{
		if (size >= elements.length)
		{
			elements = Arrays.copyOf(elements, 2 * elements.length);
		}
		elements[size++] = v;
	}
	
	public Integer dequeue()
	{
		if (isEmpty())
		{
			return null;
		}
		int first = elements[0];
		for (int i = 0; i + 1 < elements.length; i++)
		{
			elements[i] = elements[i + 1];
		}
		size--;
		return first;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public int getSize()
	{
		return size;
	}
}
