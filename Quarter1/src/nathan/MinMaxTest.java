package nathan;

public class MinMaxTest 
{
	public static void main(String[] args)
	{
		EasyReader file = new EasyReader("nums.dat");
		MinMax set = new MinMax();
		int num1 = file.readInt();
		int num2 = file.readInt();
		int num3 = file.readInt();
		int num4 = file.readInt();
		System.out.println("Numbers read from the console: "+num1+" "+num2+" "+num3+" "+num4+" ");
		set.addValue(num1);
		set.addValue(num2);
		set.addValue(num3);
		set.addValue(num4);
		System.out.println("The largest value is "+set.getLargest());
		System.out.println("The smallest value is "+set.getSmallest());
	}
}