import java.util.Date;

public class GeometricObject {
    private String  color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject()
    {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled)
    {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public String toString()
    {
        return "Create on " + dateCreated
                + "\ncolor: " + color
                + " and filled: " + filled;
    }

    public static void main(String[] args)
    {
        GeometricObject g1 = new GeometricObject();
        GeometricObject g2 = new GeometricObject("green", true);
        System.out.println(g1);
        System.out.println(g2);
    }
}
