package nathan;

public class DiceSimulationTest 
{
	public static void main (String[] args)
	{
		DiceSimulation trial = new DiceSimulation();
		EasyReader kboard = new EasyReader();
		System.out.println("Enter the amount of rolls you want:");
		int iterations = kboard.readInt();
		System.out.println("How much rolls do you want each asterisk to be?");
		int scale = kboard.readInt();
		int x = 0;
		while(x < iterations)
		{
			trial.sumDie();
			x++;
		}
		trial.createBar(scale);
		String[] asterisk = trial.getBar();
	
		for(int z = 2 ; z < 13 ; z++)
		{
			System.out.println(z +  " : " + asterisk[z] + "         " + trial.getPercentage(z, iterations));
		}
	
	}
}
