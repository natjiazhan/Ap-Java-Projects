package nathan;

public class PairofNum 
{
	private double num1;
	private double num2;
	private double sum;
	private double dif;
	private double product;
	private double quotient;
	private double average;
	private double distance;
	private double max;
	private double min;
	
	public PairofNum (double num1, double num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public double getSum()
	{
		sum = num1+num2;
		return sum;
	}
	public double getDif()
	{
		dif = num1-num2;
		return dif;
	}
	public double getProduct()
	{
		product = num1*num2;
		return product;
	}
	public double getQuotient()
	{
		quotient = (num1/num2);
		return quotient;
	}
	public double getAverage()
	{
		average = (num1+num2)/2;
		return average;
	}
	public double getDistance()
	{
		distance = Math.abs(num1-num2);
		return distance;
	}
	public double getMax()
	{
		max = Math.max(num1,num2);
		return max;
	}
	public double getMin()
	{
		min = Math.min(num1,num2);
		return min;
	}
}
