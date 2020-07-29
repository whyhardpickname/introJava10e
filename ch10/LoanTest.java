public class LoanTest
{
	public static void main(String[] args)
	{
		Loan l = new Loan(1000, 5, 0.025);
		System.out.println("MonthPayAmount = " + l.getMonthPayAmount());
		System.out.println("getTotalPayAmount = " + l.getTotalPayAmount());
	}
}