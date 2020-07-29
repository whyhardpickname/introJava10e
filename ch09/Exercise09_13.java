import java.util.Scanner;

public class Exercise09_13
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows;
		int columns;
		Scanner in = new Scanner(System.in);
		rows = in.nextInt();
		columns = in.nextInt();
		double[][] a = new double[rows][columns];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				a[i][j] = in.nextDouble();
			}
		}
		
		System.out.print("The location of largest element is " + Location.locateLargest(a).maxValue 
			+ "at (" + Location.locateLargest(a).row + ", " +  Location.locateLargest(a).column + ")");
	}
}

class Location
{
	private int row = 0;
	private int column = 0;
	private double maxValue = 0;
	
	Location()
	{
	}
	
	public static Location locateLargest(double[][] a)
	{
		Location location = new Location();
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if (a[i][j] > location.maxValue)
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
			}
		}
		
		return location;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public int getColumn()
	{
		return column;
	}
	
	public int get MaxValue()
	{
		return maxValue;
	}
}