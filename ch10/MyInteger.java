public class MyInteger
{
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public int getInt()
	{
		return value;
	}
	
	public boolean isEven()
	{
		return isEven(this.value);
	}
	
	public static boolean isEven(int value)
	{
		if (value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isEven(MyInteger myInteger)
	{
		return isEven(myInteger.getInt());
	}
	
	public boolean isOdd()
	{
		return !isEven(this.value);
	}
	
	public static boolean isOdd(int value)
	{
		return !isEven(value);
	}
	
	public static boolean isOdd(MyInteger myInteger)
	{
		return !isEven(myInteger.getInt());
	}
	
	public boolean isPrime()
	{
		return isPrime(this.value);
	}
	
	public static boolean isPrime(int value)
	{
		if (value < 2)
		{
			return false;
		}
		for (int i = 2; i * i  <= value; i++)
		{
			if (value % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(MyInteger myInteger)
	{
		return isPrime(myInteger.getInt());
	}
	
	public boolean equals(int value)
	{
		if (this.value == value)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(MyInteger myInteger)
	{
		if (myInteger == null)
		{
			return false;
		}
		else
		{
			return myInteger.equals(this.value);
		}
	}
	
	public static int parseInt(char[] array)
	{
		int number = 0;
		for (int i = 0; i < array.length; i++)
		{
			number = number * 10 + (array[i] - 48);
		}
		return number;
	}
	
	public static int parseInt(String string)
	{
		return parseInt(string.toCharArray());
	}
	
	public static void main(String[] args)
	{
		MyInteger myInteger = new MyInteger(2);
		System.out.println("myInteger.getInt() = " + myInteger.getInt());
		System.out.println("myInteger.isEven() = " + myInteger.isEven());
		System.out.println("MyInteger.isEven(2) = " + MyInteger.isEven(2));
		System.out.println("MyInteger.isEven(myInteger) = " + MyInteger.isEven(myInteger));
		System.out.println("myInteger.isOdd() = " + myInteger.isOdd());
		System.out.println("MyInteger.isOdd(2) = " + MyInteger.isOdd(2));
		System.out.println("MyInteger.isOdd(myInteger) = " + MyInteger.isOdd(myInteger));
		System.out.println("myInteger.isPrime() = " + myInteger.isPrime());
		System.out.println("MyInteger.isPrime() = " + MyInteger.isPrime(2));
		System.out.println("MyInteger.isPrime() = " + MyInteger.isPrime(myInteger));
		System.out.println("MyInteger.parseInt({'1', '2', '3'}) = " 
			+ MyInteger.parseInt(new char[] {'1', '2', '3'}));
		System.out.println("MyInteger.parseInt(\"123\") = " 
			+ MyInteger.parseInt("123"));
		
	}		
}