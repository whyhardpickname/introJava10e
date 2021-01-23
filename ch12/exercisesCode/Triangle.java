package exercisesCode;

public class Triangle
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle()
    {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double side1, double side2, double side3)
    {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else
        {
            throw new IllegalTriangleException();
        }
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea()
    {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    public String toString()
    {
        return super.toString() + "\nTriangle side1 = " + side1 + " side2 = " + side2
                + " side3 = " + side3;
    }

    public static void main(String[] args)
    {
        try
        {
            Triangle t1 = new Triangle(3, 4, 8);
        }
        catch (IllegalTriangleException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
