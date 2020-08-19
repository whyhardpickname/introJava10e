public class Exercise10_03
{
	public static void main(String[] args)
	{
		System.out.println("Test: Constructor");
		int int1 = 1;
		int int2 = 2;
		int int3 = 3;
		MyInteger myInteger1 = new MyInteger(int1);
		MyInteger myInteger2 = new MyInteger(int2);
		MyInteger myInteger3 = new MyInteger(int3);
		
		
		System.out.println("Test: isEven(int value)");
		System.out.println("Input: " + int1);
		System.out.println("Expected: false" );
		System.out.println("Output: " + MyInteger.isEven(int1));
		
		System.out.println("Input: " + int2);
		System.out.println("Expected: true" );
		System.out.println("Output: " + MyInteger.isEven(int2));
		
		
		System.out.println("Test: isEven(MyInteger myInteger)");
		System.out.println("Input: myInteger1");
		System.out.println("Expected: false" );
		System.out.println("Output: " + MyInteger.isEven(myInteger1));
		
		System.out.println("Input: myInteger1");
		System.out.println("Expected: true" );
		System.out.println("Output: " + MyInteger.isEven(myInteger2));

		
		
		
	}
}