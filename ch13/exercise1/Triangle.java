package exercise1;

/**
 * @author MarkChern
 * date 2020/12/6 16:45
 */
public class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3)
    {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getAre()
    {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double getPerimeter()
    {
        return side1 +side2 + side3;
    }

    @Override
    public String toString()
    {
        return "Triangle{" +
                "color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                ", dateCreated=" + super.getDateCreated() +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
