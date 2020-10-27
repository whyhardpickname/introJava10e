import java.util.Arrays;
import java.util.Scanner;

public class ex15
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number of the points: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] points = new double[2 * n];

        System.out.println("Enter the coordinates of the points:");
        int counter = 0;
        while (counter < 2 * n)
        {
            points[counter] = in.nextDouble();
            counter++;
        }

        double totalArea = 0;
        for (int i = 1; i < n - 1; i++)
        {
            totalArea += triangleArea(points[0], points[1],
                        points[2 * i], points[2 * i + 1],
                        points[2 * i + 2], points[2 * i + 3]);
        }

        System.out.print("The total area is " + totalArea);
    }

    public static double length(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static double triangleArea(double x1, double y1,
                                      double x2, double y2,
                                      double x3, double y3)
    {
        double side1 = length(x1, y1, x2, y2);
        double side2 = length(x1, y1, x3, y3);
        double side3 = length(x2, y2, x3, y3);
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
