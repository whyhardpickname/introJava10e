import java.util.Arrays;
import java.util.Random;
import java.lang.System;

public class Exercise09_06
{
	public static void main(String[] args)
	{
		final int length = 100000;
		int[] array = new int[length];
		
		Random random = new Random(100);
		
		for (int i = 0; i < length; i++)
		{
			array[i] = random.nextInt(length);
		}
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		Arrays.sort(array);
		sw.stop();
		
		System.out.println(sw.getElapsedTime());
	} 
}

class StopWatch
{
	private long startTime;
	private long endTime;
	
	public StopWatch()
	{
		startTime = System.currentTimeMillis();
	}
	
	public void start()
	{
		startTime = System.currentTimeMillis();
	}
	
	public void stop()
	{
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime()
	{
		return endTime - startTime;
	}
}