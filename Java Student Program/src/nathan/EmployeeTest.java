package nathan;

public class EmployeeTest 
{
	public static void main (String[] args)
	{
		Employee name1 = new Employee ("John Doe", 0.0);
		Employee name2 = new Employee ("Horatio Hornblower", 80000.0);
		Employee name3 = new Employee ("Harry hacker", 55000.0);
		name3.raiseSalary(10);
		
		System.out.println("Employee 1: ");
		System.out.println("  Name: "+name1.getName());
		System.out.println("  Salary: "+name1.getSalary());
		
		System.out.println("Employee 2: ");
		System.out.println("  Name: "+name2.getName());
		System.out.println("  Salary: "+name2.getSalary());
		
		System.out.println("Employee 3: ");
		System.out.println("  Name: "+name3.getName());
		System.out.println("  Salary: "+name3.getSalary());
	}
	
}
