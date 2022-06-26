package nathan;

public class RoachPopulationTest 
{
	public static void main(String[] args)
	{
        RoachPopulation pop = new RoachPopulation(10);
        System.out.println("Initial roach population is " + pop.getRoaches());
        pop.waitForDoubling();
        pop.Spray(10);
        
        System.out.println("After 1st round the roach population is " + pop.getRoaches());
        pop.waitForDoubling();
        pop.Spray(10);
        
        System.out.println("After 2nd round the roach population is " + pop.getRoaches());
        pop.waitForDoubling();
        pop.Spray(10);
        
        System.out.println("After 3rd round the roach population is " + pop.getRoaches());
    }
}
