package nathan;

import java.util.Scanner;

public class Wordle 
{
	public static void main(String[] args)
	{
		String[] words = {"hello", "broke", "chain", "trash", "train", "stern", "share", "trope", "place", "flask", "fiery", "later", "paper", "fault", "table"};
		String word = words[(int)(Math.random()*words.length)];
		//String word = "hello";
		Scanner input = new Scanner(System.in);
		int g = 6;
		String guess = " ";
		while (!guess.equals(word) && g > 0)
		{
			System.out.println("\nYou have "+g+" guesses remaining");
			guess = input.nextLine();
			if (guess.length()!=5) 
			{
				System.out.println("Must be 5 characters long!");
				continue;
			}
			for (int i = 0; i<word.length(); i++)
			{
				boolean didBreak = false;
				for(int j = 0; j<word.length(); j++)
				{
					if (guess.charAt(i) == word.charAt(i)) 
					{
						System.out.print("Y");
						didBreak = true;
						break;
					}
					if (guess.charAt(i) == word.charAt(j))
					{
						System.out.print("C");
						didBreak = true;
						break;
					}
				}
				if (!didBreak)
				{
					System.out.print("X");
				}
			}
			g--;
		}
		if (guess.equals(word))
		{
			System.out.println(" You guessed it! Good Job!");
			
		}
		else System.out.println(" You failed! The word was: "+word);
	}
}