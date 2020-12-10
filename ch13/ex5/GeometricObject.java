package ex5;

import java.util.Date;

/**
 * @author MarkChern
 * date 2020/12/6 16:39
 */
public abstract class GeometricObject implements Comparable
{
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject()
    {
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
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

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString()
    {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static int compare(GeometricObject g1, GeometricObject g2)
    {
        return Double.compare(g1.getArea(), g2.getArea());
    }
}
