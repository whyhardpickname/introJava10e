public class StackOfIntegersTest
{
	public static void main(String[] args)
	{
		StackOfIntegers stack = new StackOfIntegers(10);
		
		for (int i = 0; i < 11; i++)
		{
			stack.push(i);
		}
		
		System.out.println("size = " + stack.getSize());
		
		System.out.println("peek = " + stack.peek());
		
		System.out.println("pop = " + stack.pop());
		
		System.out.println("size = " + stack.getSize());
		
		System.out.println("peek = " + stack.peek());
		
	}
}