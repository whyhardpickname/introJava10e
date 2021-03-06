import java.util.Date;

public class Account
{
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account() {}

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }

    public String getDateCreated()
    {
        return dateCreated.toString();
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public void withDraw(double amount)
    {
        this.balance -= amount;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}