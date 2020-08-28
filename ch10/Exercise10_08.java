public class Exercise10_08
{
	public static void main(String[] args)
	{
		public static void main(String[] args) 
	{
		int[][] bracketsFor2001 = 
		{
		  {27050, 65550, 136750, 297350}, // Single filer
		  {45200, 109250, 166500, 297350}, // married filing jointly
		  {22600, 54625, 83250, 148675}, // married filing separately
		  {36250, 93650, 151650, 297350} // head of household
		};

		double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

		int[][] bracketsFor2002 = 
		{
		  {6000, 27950, 67700, 141250, 307050}, // Single filer
		  {12000 , 46700, 112850, 171950, 307050}, // married filing jointly
		  {6000, 23350, 56425, 85975, 153525}, // married filing separately
		  {10000, 37450, 96700, 156600, 307050} // head of household
		};

		double[] ratesFor2002 = {0.1, 0.15, 0.27, 0.30, 0.35, 0.386};
		
		System.out.println("Tax for 2001");
		System.out.println("taxableIncome "
			+ "                         SINGLE_FILER "
			+ "MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER "
			+ "                   MARRIED_SEPARATELY "
			+ "                    HEAD_OF_HOUSEHOLD ");
		for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000)
		{
			System.out.printf("%13d", taxableIncome);
			for (int filingStatus = 0; filingStatus < bracketsFor2001.length; filingStatus++)
			{
				Tax tax = new Tax(filingStatus, bracketsFor2001, ratesFor2001, taxableIncome);
				System.out.printf("%37.2f", tax.getTax());
			}
			System.out.println();
		}
	}
	}
}