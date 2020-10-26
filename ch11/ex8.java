/**
 * @author MarkChern
 * date 2020/10/24 15:03
 */
public class ex8
{
    public static void main(String[] args)
    {
        AccountOfArraylist account = new AccountOfArraylist("George", 1122, 1000);
        account.setAnnualInterestRate(0.015);
        account.deposit(30, "");
        account.deposit(40, "");
        account.deposit(50, "");
        account.withdraw(5, "");
        account.withdraw(4, "");
        account.withdraw(2, "");
        System.out.println(account);
    }
}
