package nathan;

public class Car 
{
	private double distance;
	private double fuel;
	private double mpg;
	
	public Car (double m)
	{
		mpg = m;
		fuel = 0;
	}
	public void addGas(double add)
	{
		fuel = fuel + add;
	}
	public void drive (double d)
	{
		distance = distance +d;
		//mpg = fuel*mpg/d;
		fuel = fuel - d/mpg;
	}
	public double getGas()
	{
		return fuel;
	}
}
