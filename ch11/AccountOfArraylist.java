import java.util.ArrayList;
import java.util.Date;

/**
 * @author MarkChern
 * date 2020/10/24 14:24
 */
public class AccountOfArraylist
{
    private static int counter = 0;
    private int id;
    private String name;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transations = new ArrayList<>();

    public AccountOfArraylist()
    {
        id = counter++;
    }

    AccountOfArraylist(String name, int id, double balance)
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public ArrayList<Transaction> getTransations()
    {
        return transations;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate)
    {
        AccountOfArraylist.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount, String description)
    {
        Transaction transaction = new Transaction('W', amount, balance, description);
        transations.add(transaction);
    }

    public void deposit(double amount, String description)
    {
        Transaction transaction = new Transaction('D', amount, balance, description);
        transations.add(transaction);
    }

    @Override
    public String toString()
    {
        return "AccountOfArraylist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                ", transations=" + transations +
                '}';
    }
}
