package nathan;

public class CarTest 
{
	public static void main(String []args)
	{
		Car myBeemer = new Car(29);
		myBeemer.addGas(20);
		myBeemer.drive(100);
		System.out.println("The amount of gas "+myBeemer.getGas());
	}
}
