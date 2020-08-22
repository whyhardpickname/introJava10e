public class Exercise10_03
{
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