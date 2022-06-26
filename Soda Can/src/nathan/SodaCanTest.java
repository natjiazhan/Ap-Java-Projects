package nathan;

public class SodaCanTest 
{
	public static void main(String []args)
	{
		SodaCan soda1 = new SodaCan(4.25, 2.0);
		
		System.out.println("Dimensions of the can:");
		System.out.println("   height = "+soda1.getHeight());
		System.out.println("   radius = "+soda1.getRadius());
		
		System.out.println("Calculated values:");
		System.out.println("   surface area = "+soda1.getSurfaceArea());
		System.out.println("   volume = "+soda1.getVolume());
		
		
	}
}
