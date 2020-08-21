public class Tax
{
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int filingStatus;
	private int[][] brackets = new in[4][5];
	private double[] rates = new double[5];
	private double taxableIncome;
	
	public int[][] getBrackets()
	{
		return brackets;
	}
	
	public double[] getRates()
	{
		return rates;
	}
	
	public double getTaxableIncome()
	{
		return taxableIncome;
	}
	
	public double getTax()
	{
		double tax = 0;
		for (int i = 0; i < rates.length; i++)
		{
			if (taxableIncome > brackets[filingStatus][i])
				
		}
		
		
		return tax;
	}
	
	public void setBrackets(int[][] brackets)
	{
		this.brackets = brackets;
	}
	
	public void setRates(double[] rates)
	{
		this.rates = rates;
	}
	
	public void setTaxableIncome()
	{
		this.taxableIncome = taxableIncome;
	}
}