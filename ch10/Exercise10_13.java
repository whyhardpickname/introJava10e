public class Exercise10_13
{
	public static void main(String[] args)
	{
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 6, 8);
		MyRectangle2D r2 = new MyRectangle2D(4, 5, 10, 4);
		MyRectangle2D r3 = new MyRectangle2D(3, 5, 2, 6);
		System.out.println("r1.getArea() = " + r1.getArea());//48
		System.out.println("r1.getPerimeter() = " + r1.getPerimeter());//28
		System.out.println("r1.contains(3, 3) = " + r1.contains(3, 3));//true
		System.out.println("r1.contains(r2) = " + r1.contains(r2));//false
		System.out.println("r1.contains(r3) = " + r1.overlaps(r3));//true
	}
}