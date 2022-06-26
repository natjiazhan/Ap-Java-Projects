package nathan;

public class Employee 
{
	private String name;
	private double salary;
	
	public Employee ()
	{
		this.name = "John Doe";
		salary = 0.0;		
	}
	public Employee(String name, double s)
	{
		this.name = name;
		salary = s;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void raiseSalary (double byPercent)
	{
		salary = (salary/100)*byPercent + salary;
	}
	
}