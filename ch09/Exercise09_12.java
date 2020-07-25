import java.util.Scanner;

public class Exercise09_12
{
	public static void main(String[] args)
	{
		double[][] endpoint = new double[4][2];
		Scanner in = new Scanner(System.in);
		
		System.out.println("First enter line1 endpoint (x1,y1) and (x2,y2)");
		System.out.println("Second enter line2 endpoint (x3,y3) and (x4,y4)");
		for (int i = 0; i < endpoint.length; i++)
		{
			for (int j = 0; j < endpoint[i].length; j++)
				endpoint[i][j] = in.nextDouble();
		}
		
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		LinearEquation crossPoint = new LinearEquation(a, b, c, d, e, f);
		
		if (endpoint[0][0] != endpoint[1][0] && endpoint[2][0] != endpoint[3][0])
		{
			a = (endpoint[0][1] - endpoint[1][1]) / (endpoint[0][0] - endpoint[1][0]);
			b = -1;
			c = (endpoint[2][1] - endpoint[3][1]) / (endpoint[2][0] - endpoint[3][0]);
			d = -1;
			e = a * endpoint[0][0] - endpoint[0][1];
			f = c * endpoint[2][0] - endpoint[2][1];
		}
		else if (endpoint[0][0] == endpoint[1][0] && endpoint[2][0] != endpoint[3][0])
		{
			a = 1;
			b = 0;
			c = (endpoint[2][1] - endpoint[3][1]) / (endpoint[2][0] - endpoint[3][0]);
			d = -1;
			e = endpoint[0][0];
			f = b * endpoint[2][0] - endpoint[2][1];
		}
		else if (endpoint[0][0] != endpoint[1][0] && endpoint[2][0] == endpoint[3][0])
		{
			a = (endpoint[0][1] - endpoint[1][1]) / (endpoint[0][0] - endpoint[1][0]);
			b = -1;
			c = 1;
			d = 0;
			e = a * endpoint[0][0] - endpoint[0][1];
			f = endpoint[2][0];
		}
		else
		{
			a = 1;
			b = 0;
			c = 1;
			d = 0;
			e = endpoint[0][0];
			f = endpoint[2][0];
		}
		
		crossPoint = new LinearEquation(a, b, c, d, e, f);
		if (crossPoint.isSolvable())
			System.out.println("crossPoint(" + crossPoint.getX() + "," + crossPoint.getY()+ ")");
		else
			System.out.println("they don't cross.");
	}
}