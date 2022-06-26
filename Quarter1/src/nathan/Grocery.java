package nathan;

public class Grocery 
{
	private String name;
	private int quantity;
	private double price;
//default constructor
	public Grocery ()
	{
		this.name = "no item";
		quantity = 0;
		price = 0.0;
	}
//parameterized constructor
	public Grocery(String name, int q, double p)
	{
		this.name = name;
		quantity = q;
		price = p;
	}
	public String getItem()
	{
		return name;
	}
	public double calculateUnitPrice()
	{
		return price/quantity;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void addOne()
	{
		quantity++;
	}
}
