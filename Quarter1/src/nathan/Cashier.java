package nathan;

public class Cashier 
{

	private int change;
	
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	final int dollarVal = 100;
	final int quarterVal = 25;
	final int dimeVal = 10;
	final int nickelVal = 5;
	final int pennyVal = 1;

	public Cashier()
	{
		this.dollars = 0;
		this.quarters = 0;
		this.dimes = 0;
		this.nickels = 0;
		this.pennies = 0;
	}
	public Cashier(double due, double recieved)
	{
		change = (int) ((recieved-due)*100);
	}
	public int getDollars()
	{
		dollars = change/dollarVal;
		change = change%dollarVal;
		return dollars;
	}
	public int getQuarters()
	{
		quarters = change/quarterVal;
		change = change%quarterVal;
		return quarters;
	}
	public int getDimes()
	{
		dimes = change/dimeVal;
		change = change%dimeVal;
		return dimes;
	}
	public int getNickels()
	{
		nickels = change/nickelVal;
		change = change%nickelVal;
		return nickels;
	}
	public int getPennies()
	{
		pennies = change/pennyVal;
		change = change%pennyVal;
		return pennies;
	}
	
}
