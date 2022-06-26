package nathan;

public class Loops 
{
	public static void main(String[] args)
	{
		
		EasyReader kb = new EasyReader();
        EasyReader file = new EasyReader("num.dat");
        
		/*
		EasyReader kb = new EasyReader(); //16
		
		System.out.println("Please type in a positive number: ");
		int num = kb.readInt();  //prime loop
		while (num > 0)
		{
			System.out.println(num+ " is a positive number");
			
			num = kb.readInt();  //continues loop
		}
		System.out.println();
		System.out.println("End of snippet");
		*/
		
		/*
		 int num; //17
        do
        {
            //System.out.println("Please enter a even number");
            num = file.readInt();
            System.out.println(num);
        } while(num%2 == 0);
		*/
		
		/*
		EasyReader kb = new EasyReader(); //18
		
		System.out.println("Please type in a positive value: ");
		int num = kb.readInt();  //prime loop
		while (num > 0)
		{
			if ( num > 10 || num < 10)
				{
				System.out.println(num);
				}
			else
			{
				System.out.println("Sentinel value reached");
			}
			num = kb.readInt();  //continues loop
		}
		*/
		
		/*
		EasyReader kb = new EasyReader(); //19
		
		System.out.println("Please type in a positive value: ");
		int x = kb.readInt();  //prime loop
		int y = 1;
		while (x >= 0)
		{
			if ( x != 0)
				{
				y = y*x;
				}
			else
			{
				System.out.println(y);
			}
			x = kb.readInt();  //continues loop
		}
		*/
		
		/*
		int x = 1; //20
		while ( x <= 100 )
		{
			if (x%2 != 0)
			{
				System.out.println(x);
			}
			x++;
		}
		*/
		
		/*
		int x = 300; //21
		while ( x >= 3 )
		{
			if (x%3 == 0)
			{
				System.out.println(x);
			}
			x= x - 3;
		}
		*/
		
		/*
		int x = 1; //22
		while ( x <= 100)
		{
			if (x%4 == 0 && x%5 != 0)
			{
				System.out.println(x);
			}
			x++;
		}
		*/
		
		/*
		EasyReader kb = new EasyReader(); //23
		
		System.out.println("Please type in a positive number: ");
		int num = kb.readInt();  //prime loop
		int x = num;
		int y = 1;
		while (x > 0)
		{
			if (num%x == 0)
			{
				y = num/x;
				System.out.println(x + " " + y);
			}
			x--;
		}
		System.out.println();
		System.out.println("End of snippet");
		*/
		
        /*
        System.out.println("Please enter 10 integers"); //24
        int num;
        int HIGH = Integer.MIN_VALUE;
        int LOW = Integer.MAX_VALUE;
        for(int x = 1; x<=10;x++)
        {
            num = kb.readInt();
            if(num>HIGH)
                HIGH = num;
            if (num<LOW)
                LOW = num;
        }
            System.out.println("The highest is "+HIGH);
            System.out.println("The lowest is "+LOW);
            
        */
        
        /* 
        System.out.println("Please enter a string"); //25
        String str = kb.readWord();
        int x;
        int c = 0;
        for(x=0;x<str.length();x++)
        {
            if (str.charAt(x)=='a')
            c++;
        }
        System.out.println(c);
        */
        
        /*
        System.out.println("Please enter a string"); //26
        String str = kb.readWord();
        int x;
        for(x=str.length()-1;x>=0;x--)
        {
            System.out.println(str.charAt(x));
        }
        */
        
        /*
        System.out.println("Please enter a string"); //27
        String str = kb.readWord();
        int x;
        for(x=0;x<str.length();x=x+2)
        {
            System.out.println(str.charAt(x));
        }
        */
        
        /*
        System.out.println("Please enter the amount of lines you want"); //28
        int LINES = kb.readInt();
        for(int line = 0;line < LINES; line++)
        {
            for(int white = 0; white<line; white++)
                    System.out.print(" ");
            System.out.println("*");
        }
        */
        
        
        System.out.println("Please enter a string"); //29
        String str = kb.readWord();
        int x;
        for(x=0;x<str.length();x++)
        {
            for(int white = 0;white<x;white++)
                System.out.print(" ");
        System.out.println(str.charAt(x));
        }
        System.out.println("end of snippet");
		
		
	}
}
