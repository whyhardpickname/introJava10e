public class ex3
{
    public static void main(String[] args)
    {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingAccount savingAccount = new SavingAccount();
        checkingAccount.setBalance(1000);
        savingAccount.setBalance(1000);

        checkingAccount.withDraw(2001);
        savingAccount.withDraw(1001);
        checkingAccount.withDraw(1500);
        System.out.println(checkingAccount.getOverdraft());
        savingAccount.withDraw(500);
        System.out.println(savingAccount.getBalance());
    }
}
