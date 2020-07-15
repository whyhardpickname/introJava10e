public class Exercise01_11 
{
		
	public static void main(String[] args) 
	{
		long oneYearSeconds = 365 * 24 * 60 * 60;
		NationalPopulation American = new NationalPopulation(oneYearSeconds / 7, oneYearSeconds / 13, oneYearSeconds / 45, 312032486);
		for (int i = 1; i < 6; i++)
		{
			System.out.println(American.NYearsPopulation(i));
		}	
	}
}

class NationalPopulation
{
	private long annualPopulation = 0;
	private long annualDeathToll = 0;
	private long annualImmigrants = 0;
	private long nationalPopulation = 0;
	
	public NationalPopulation(long annualPopulation, long annualDeathToll, long annualImmigrants, long nationalPopulation)
	{
		this.annualPopulation = annualPopulation;
		this.annualDeathToll = annualDeathToll;
		this.annualImmigrants = annualImmigrants;
		this.nationalPopulation = nationalPopulation;
	}
	
	public long NYearsPopulation(int years)
	{
		return nationalPopulation + years * (annualPopulation - annualDeathToll + annualImmigrants);
	}
}