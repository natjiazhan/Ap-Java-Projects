package nathan;

public class MinMax 
{
	private int max;
	private int min;
	public MinMax()
	{
		min=Integer.MAX_VALUE;
		max=Integer.MIN_VALUE;
		
	}
	public void addValue(int x)
	{
		min = Math.min(min, x);
		max = Math.max(max, x);
	}
	public int getLargest()
	{
		return max;
	}
	public int getSmallest()
	{
		return min;
	}
}
