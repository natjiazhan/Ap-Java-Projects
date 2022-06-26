package nathan;

public class PairofNumTest 
{
	public static void main(String[]args)
	{
		EasyReader kboard = new EasyReader();
		System.out.println("Enter a number: ");
		double num1 = kboard.readDouble();
		System.out.println("Enter another number: ");
		double num2 = kboard.readDouble();
		PairofNum s = new PairofNum(num1, num2);
		System.out.println("Sum = "+s.getSum());
		System.out.println("Difference = "+s.getDif());
		System.out.println("Product = "+s.getProduct());
		System.out.println("Quotient = "+s.getQuotient());
		System.out.println("Average = "+s.getAverage());
		System.out.println("Distance = "+s.getDistance());
		System.out.println("Maximum value = "+s.getMax());
		System.out.println("Minimum value = "+s.getMin());
		
	}
}
