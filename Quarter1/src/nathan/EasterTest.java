package nathan;
import javax.swing.JOptionPane;
public class EasterTest 
{
	public static void main (String[] args)
	{
		String input = JOptionPane.showInputDialog("Type in 1st year:");
		int year = Integer.parseInt(input);
		String input2 = JOptionPane.showInputDialog("type in 2nd year:");
		int year2 = Integer.parseInt(input2);
		Easter s = new Easter(year);
		Easter s2 = new Easter(year2);
		String ans = "Easter Sunday for "+year+'\n';
		ans = ans +"month:"+s.getEasterSundayMonth()+'\n';
		ans = ans + "date:"+s.getEasterSundayDay()+'\n';
		ans = ans + "Easter Sunday for "+year2+'\n';
		ans = ans +"month:"+s2.getEasterSundayMonth()+'\n';
		ans = ans + "date:"+s2.getEasterSundayDay()+'\n';
		JOptionPane.showMessageDialog(null, ans);
	}
}
