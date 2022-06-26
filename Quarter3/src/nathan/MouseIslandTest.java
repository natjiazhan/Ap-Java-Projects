package nathan;

public class MouseIslandTest 
{
	public static void main(String[] args) 
	{
		int[] result = new int[3];
		for(int i = 0; i < 3; i++) 
		{
			MousIsland myIsland = new MousIsland();
			myIsland.moveAbout();
			result[myIsland.getResult()] += 1;
			System.out.println(myIsland.PrintIsland());
		}
		for(int i = 0; i < 997; i++) 
		{
			MousIsland myIsland = new MousIsland();
			myIsland.moveAbout();
			result[myIsland.getResult()] += 1;
		}
		System.out.println("In 1000 simulations: \n" +
						   "    percent escaped = " + (double)result[0]/10 + '\n' + 
						   "    percent drowned = " + (double)result[2]/10 + '\n' + 
						   "    percent starved = " + (double)result[1]/10 + '\n');
	}

}