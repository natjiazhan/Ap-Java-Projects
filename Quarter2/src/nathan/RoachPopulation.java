package nathan;

public class RoachPopulation 
{
	private double roach;
	public RoachPopulation(double roach)
	{
		this.roach=roach;
	}
	public double waitForDoubling()
	{
		roach = roach*2;
		return roach;
	}
	public double Spray(double s)
	{
		roach = roach*(1-s/100);
		return roach;
	}
	public double getRoaches()
	{
		return roach;
	}
}
