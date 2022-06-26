package nathan;

public class SodaCan 
{
	private String soda;
	private int ID;
	private int transaction;
	private int amount;
	public SodaCan(String soda, int ID, int amount) 
	{
		this.soda = soda;
		this.ID = ID;
		transaction = 0;
		this.amount = amount;
	}
	public String getName() 
	{
		return soda;
	}
	public int getID() 
	{
		return ID;
	}
	public int getTransactions() 
	{
		return transaction;
	}
	public int getInventory() 
	{
		return amount;
	}
	public void adjustInventory(int amount) 
	{
		this.amount += amount;
		transaction++;
	}
}
