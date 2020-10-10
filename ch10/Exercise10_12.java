package ch10;
public class Exercise10_12
{
	public static void main(String[] args)
	{
		Triangle2D t1 = new Triangle2D(
			new MyPoint(2.5, 2),
			new MyPoint(4.2, 3),
			new MyPoint(5, 3.5));
		System.out.println("area=" + t1.getArea());
		System.out.println("perimeter=" + t1.getPerimeter());
		Triangle2D t2 = new Triangle2D(
			new MyPoint(2.9, 2),
			new MyPoint(4, 1),
			new MyPoint(1, 3.4));
		System.out.println("contains(t2)=" + t1.contains(t2));
		Triangle2D t3 = new Triangle2D(
			new MyPoint(2, 5.5),
			new MyPoint(4, -3),
			new MyPoint(2, 6.5));
		System.out.println("overlaps(t3)=" + t1.overlaps(t3));
		MyPoint p = new MyPoint(2.82812, 2.1954);
		System.out.println("t1.contains(4, 2.9)=" + t1.contains(p));
		System.out.println("t3contains(4, 2.9)=" + t3.contains(p));


		
	}
}