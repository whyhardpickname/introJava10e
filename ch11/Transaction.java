import java.util.Date;

/**
 * @author MarkChern
 * date 2020/10/24 14:47
 */
public class Transaction
{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description)
    {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate()
    {
        return date;
    }

    public char getType()
    {
        return type;
    }

    public double getAmount()
    {
        return amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public void setType(char type)
    {
        this.type = type;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
