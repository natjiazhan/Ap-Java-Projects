package nathan;

public class Easter 
{
	private int y;
	private int n;
	private int p;
	public Easter (int year)
	{
		y = year;
		int a = y%19;
		int b = y/100;
		int c = y%100;
		int d = b/4;
		int e = b%4;
		int g = (8*b+13)/25;
		int h = (19*a+b-d-g+15)%30;
		int j = c/4;
		int k = c%4;
		int m = (a+11*h)/319;
		int r = (2*e+2*j-k-h+m+32)%7;
		n = (h-m+r+90)/25;
		p = (h-m+r+n+19)%32;
	}
	public String getEasterSundayMonth()
	{
		String month = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
		String month2 = month.substring(9*(n-1),9*(n-1)+9);
		return month2;
	}
	public int getEasterSundayDay()
	{
		return p;
	}
	 
}
