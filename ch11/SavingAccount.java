public class SavingAccount extends Account
{
    @Override
    public void withDraw(double amount)
    {
        if (amount <= getBalance())
        {
            setBalance(getBalance() - amount);
        }
        else
        {
            System.out.println("The account doesn't have enough balance.");
        }
    }
}
