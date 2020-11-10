package exercises;

import javax.sound.midi.Soundbank;

public class Loan
{
	private double loanAmonut;
	private double annualInterestRate;
	private int loanYear;
	private java.util.Date loanDay;

	public Loan()
	{
		loanAmonut = 0;
		annualInterestRate = 0.025;
		loanDay = new java.util.Date();
	}

	public Loan(double loanAmonut, int loanYear, double annualInterestRate) throws IllegalArgumentException
	{
		if (loanAmonut <= 0 || loanYear <= 0 || annualInterestRate <= 0)
		{
			throw new IllegalArgumentException("loanAmonut, loanYearm and annualInterestRate is positive.");
		}
		this.loanAmonut = loanAmonut;
		this.annualInterestRate = annualInterestRate;
		this.loanYear = loanYear;
		loanDay = new java.util.Date();
	}

	public double getMonthInterestRate()
	{
		return annualInterestRate / 12;
	}

	public double getMonthPayAmount()
	{
		double monthPay = loanAmonut * getMonthInterestRate() / (1 - (1 / Math.pow(1 + getMonthInterestRate(), loanYear * 12)));
		return monthPay;
	}

	public double getTotalPayAmount()
	{
		return getMonthPayAmount() * loanYear * 12;
	}

	public static void main(String[] args)
	{
		try
		{
			Loan loan = new Loan(-1, 1, 1);
		} catch (IllegalArgumentException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}