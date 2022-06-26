package nathan;
/**
 * 
 * @author nathanzhang
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class CalculationTest {
	public static void main(String[]args) throws IOException
	{
		System.out.println("This program will guess you birthday and month");
		System.out.println("Answer the following questions and do the simple math");
		System.out.println();
		System.out.println("1. Take the number of the month that you were born 1-Jan, 2-Feb, etc");
		System.out.println("2. Double the month number");
		System.out.println("3. Next add 6");
		System.out.println("4. Multiply the result by 50");
		System.out.println("5. Add the day of the month that you were born");
		System.out.println("6. Subtract 365 from that number");
		System.out.println();
		
		String input = JOptionPane.showInputDialog("Enter this number into the computer");
		int count = Integer.parseInt(input);
		Calculation number = new Calculation(count);
		number.finalCalculation(count);
		System.out.println();
		System.out.println("You were born in the month "+ number.getMonth());
		System.out.println("You were born on the day "+number.getDay());
		
	}

}
