package nathan;

public class MusicTapesTest 
{
	public static void main (String[] args)
	{
		EasyReader file = new EasyReader("Music.dat");
		int b = file.readInt();
		String c = file.readWord();
		int d = file.readInt();
		int e = file.readInt();
		MusicTapes s = new MusicTapes(b,c,d,e);
		System.out.println(EasyFormat.format(s.getNumber()+"",20,'c',0)+EasyFormat.format(s.getSong(),20,'c',0)+EasyFormat.format(d+"",20,'c',0)+EasyFormat.format(e+"",20,'c',0)+EasyFormat.format(s.getMinute()+"",20,'c',0)+EasyFormat.format(s.getSecond()+"",20,'c',0));
		b = file.readInt();
		while (b!=0)
		{
			String g = file.readWord();
			int h = file.readInt();
			int i = file.readInt();
			s.addSong(b, g, h, i);
			System.out.println(EasyFormat.format(s.getNumber()+"",20,'c',0)+EasyFormat.format(s.getSong(),20,'c',0)+EasyFormat.format(h+"",20,'c',0)+EasyFormat.format(i+"",20,'c',0)+EasyFormat.format(s.getMinute()+"",20,'c',0)+EasyFormat.format(s.getSecond()+"",20,'c',0));
			b = file.readInt();
		}
		int j = 80-s.getMinute();
		int k = 0;
		if (s.getSecond()>0)
		{
			j--;
			k= k+60-s.getSecond();
		}
		System.out.println("There are "+j+" minutes and "+k+" seconds of time remaining");
	}
}

