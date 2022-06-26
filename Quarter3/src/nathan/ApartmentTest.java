package nathan;

public class ApartmentTest
{

	public static void main(String[] args) 
	{
		EasyReader readCust = new EasyReader("Cust.dat");
		EasyReader readApt = new EasyReader("Apt.dat");
		char[] custArr = new char[30];
		String custName = "";
		for(int i = 0; i < custArr.length; i++) 
		{
			custArr[i] = readCust.readChar();
		}
		custName = readCust.readLine();
		Customer myCust = new Customer(custName, custArr);
		System.out.println("For: " + myCust.getName() + '\n');
		char[] aptArr = new char[30];
		String aptName = "";
		int aptNum = readApt.readInt();
		readApt.readChar();
		readApt.readChar();
		System.out.println("Address                Number of Matches     % Response");
		System.out.println("------------------    -----------------     ----------");
		for(int i = 0; i < aptNum; i++) {
			for(int j = 0; j < aptArr.length; j++) 
			{
				aptArr[j] = readApt.readChar();
			}
			aptName = readApt.readLine();
			Apartment myApt = new Apartment(aptName, aptArr);
			if((double)(myApt.cmpApartment(myCust.getPref()))/30 >= .8)
			{
			System.out.print(EasyFormat.format(myApt.getName(), 22, 'L', 0));
			System.out.print(EasyFormat.format("" + myApt.cmpApartment(myCust.getPref()), 19, 'L', 0)); 
			{
				System.out.println("   Possible");
			}
			}
		}
	}

}