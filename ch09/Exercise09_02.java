public class Exercise09_02
{
	public static void main(String[] args)
	{
		Stock oracle = new Stock("ORCL", "Oracle Corporation");
		
		oracle.setPreviousClosingPrice(34.5);
		oracle.setCurrentPrice(34.35);
		System.out.printf("%4.2f", oracle.getChangePercent());
	}
}

class Stock
{
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name)
	{
		this.symbol = symbol;
		this.name = name;
	}
	
	public void setCurrentPrice(double currentPrice)
	{
		this.currentPrice = currentPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice)
	{
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public double getChangePercent()
	{
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}
}