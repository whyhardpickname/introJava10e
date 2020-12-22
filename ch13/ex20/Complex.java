package ex20;

/**
 * @author MarkChern
 * date 2020/12/17 16:44
 */
public class Complex
{
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real)
    {
        this.real = real;
    }

    public Complex()
    {
    }

    public double getReal()
    {
        return real;
    }

    public void setReal(double real)
    {
        this.real = real;
    }

    public double getImaginary()
    {
        return imaginary;
    }

    public void setImaginary(double imaginary)
    {
        this.imaginary = imaginary;
    }

    public Complex add(Complex other)
    {
        double real = this.getReal() + other.getReal();
        double imaginary = this.getImaginary() + other.getImaginary();
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex other)
    {
        double real = this.getReal() - other.getReal();
        double imaginary = this.getImaginary() - other.getImaginary();
        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex other)
    {
        double real = this.getReal() * other.getReal() - this.getImaginary() * other.getImaginary();
        double imaginary = this.getImaginary() * other.getReal() + this.getReal() * other.getImaginary();
        return new Complex(real, imaginary);
    }

    public Complex divide(Complex other)
    {
        double real = (this.getReal() * other.getReal() + this.getImaginary() * other.getImaginary()) /
                (other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary());
        double imaginary = (this.getImaginary() * other.getReal() - this.getReal() * other.getImaginary()) /
                (other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary());
        return new Complex(real, imaginary);
    }

    public double abs()
    {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString()
    {
        return real + " + " + imaginary + "i";
    }
}