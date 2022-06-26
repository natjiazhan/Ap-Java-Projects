package nathan;

public class SodaCan 
{
	private double height;
	private double radius;
	private double pi;
	private double SA;
	private double volume;
	public SodaCan(double height, double radius)
	{
		this.height=height;
		this.radius=radius;
		pi = 3.14159;
		SA = 0.0;
		volume = 0.0;
	}
	public double getHeight()
	{
		return height;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getSurfaceArea()
	{
		SA = SA+2*pi*radius*radius+2*pi*radius*height;
		return SA;
	}
	public double getVolume()
	{
		volume = volume+pi*radius*radius*height;
		return volume;
	}
	
}
