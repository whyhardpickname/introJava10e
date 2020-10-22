public class CheckingAccount extends Account
{
    private double overdraft = 1000;

    @Override
    public void withDraw(double amount)
    {
        if (amount <= getBalance())
        {
            setBalance(getBalance() - amount);
        }
        else if (amount <= getBalance() + overdraft)
        {
            overdraft -= (amount - getBalance());
            setBalance(0);
        }
        else
        {
            System.out.println("The account doesn't have enough overdraft.");
        }
    }

    public double getOverdraft()
    {
        return overdraft;
    }

    @Override
    public String toString()
    {
        return "CheckingAccount{" +
                "id=" + getId() +
                ", balance=" + getBalance() +
                ", dateCreated=" + getDateCreated() +
                "overdraft=" + overdraft +
                '}';
    }
}
