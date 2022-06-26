package nathan;

public class CashierTest 
{
	public static void main (String[] args)
	{
		EasyReader kboard = new EasyReader();
		System.out.print("Enter the amount due in dollars and cents: $ ");
		double due = kboard.readDouble();
		System.out.print("Enter the amount recieved: $ ");
		double received = kboard.readDouble();
		Cashier s = new Cashier(due, received);
		System.out.println("Amount of Dollars = "+s.getDollars());
		System.out.println("Amount of Quarters = "+s.getQuarters());
		System.out.println("Amount of Dimes = "+s.getDimes());
		System.out.println("Amount of Nickels = "+s.getNickels());
		System.out.println("Amount of Pennies = "+s.getPennies());
	}	
}
