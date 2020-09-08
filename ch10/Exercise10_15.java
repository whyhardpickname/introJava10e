public class Exercise10_15
{
	public static void main(String[] args)
	{
		double[][] points = 
		{
			{1, 2.5},
			{3, 4},
			{5, 6},
			{7, 8},
			{9, 10}
		};
		MyRectangle2D r1 = MyRectangle2D.getRectangle(points);
		System.out.println("r1.getX() = " + r1.getX());
		System.out.println("r1.getY() = " + r1.getY());
		System.out.println("r1.getWidth() = " + r1.getWidth());
		System.out.println("r1.getHeight() = " + r1.getHeight());
	}
}