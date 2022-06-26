package nathan;

public class GroceryTest 
{
	public static void main (String[] args)
	{
		Grocery item1 = new Grocery ("oranges",10,2.99);
		Grocery item2 = new Grocery ("eggs",12,1.69);
		Grocery item3 = new Grocery ("apples",3,1.00);
		Grocery item4 = new Grocery ("watermelon",1,4.99);
		Grocery item5 = new Grocery ("bagels",6,3.50);
		
		System.out.print("Item: "+item1.getItem()+"  "+item1.calculateUnitPrice() );
		System.out.print("Item: "+item2.getItem()+"  "+item2.calculateUnitPrice() );
		System.out.print("Item: "+item3.getItem()+"  "+item3.calculateUnitPrice() );
		System.out.print("Item: "+item4.getItem()+"  "+item4.calculateUnitPrice() );
		System.out.print("Item: "+item5.getItem()+"  "+item5.calculateUnitPrice() );
		item5.addOne();
		System.out.println("item: "+item5.getItem()+ " "+item5.calculateUnitPrice() );
	}
}