package nathan;

public class DiceSimulation 
{
	private int[] totalRolls;
	private String[] bar = new String[13];
	private int sum;
	public DiceSimulation ()
	{
		totalRolls = new int[13];
		for(int x = 0 ; x < bar.length ; x++)
		{
			bar[x] = "";
		}
	}
	public void sumDie()
	{
		sum = ((int)(Math.random()*6)+1) + ((int)(Math.random()*6)+1);
		for(int x = 0 ; x < totalRolls.length ; x++)
		{
			if(sum == x)
			{
				totalRolls[x]++;
			}
		}
	}
	public String[] createBar(int scale)
	{	
		for(int x = 2 ; x < totalRolls.length ; x++)
		{
			int y = 0;
			while(y!=totalRolls[x]/scale)
			{
				bar[x] = bar[x] + "*";
				y++;
			}
		}
		return bar;
	}
	public double getPercentage(int index, int rolls)
	{
		return Math.round((double) (100* ((double) totalRolls[index] / rolls)));
	
	}
	public int[] gettotalRolls()
	{
		return totalRolls;
	}
	public String[] getBar()
	{
		return bar;
	}
}

