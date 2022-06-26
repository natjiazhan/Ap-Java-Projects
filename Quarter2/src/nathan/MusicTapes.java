package nathan;

public class MusicTapes 
{
	private String song;
	private int number;
	private int minute;
	private int second;
	
	public MusicTapes(int d, String a, int b, int c)
	{
		number = d;
		song = a;
		minute = b;
		second = c; 
	}
	public void addSong(int d, String c, int a, int b)
	{
		number = d;
		song = c;
		minute = minute+a;
		second = second+b;
		if (second>=60)
		{
			minute++;
			second=second-60;
		}
	}
	public String getSong()
	{
		return song;
	}
	public int getNumber()
	{
		return number;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
}
