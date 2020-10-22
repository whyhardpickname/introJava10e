import java.util.Date;
public class Exercise09_07
{
	public static void main(String[] args)
	{
		Account account = new Account(1122, 20000.0);
		
		account.setAnnualInterestRate(4.5);
		account.withDraw(2500);
		account.deposit(3000);
		
		double monthlyInterest = account.getMonthlyInterestRate() / 100
			* account.getBalance();
		System.out.println("Account[balance=" + account.getBalance()
			+ ", monthlyInterestRate=" + monthlyInterest 
			+ ", dateCreated=" + account.getDateCreated());
	}
}

