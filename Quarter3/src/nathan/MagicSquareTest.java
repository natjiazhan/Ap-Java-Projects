package nathan;

public class MagicSquareTest 
{
	public static void main(String[] args)
	{
		MagicSquare square = new MagicSquare();
		EasyReader file = new EasyReader("square.dat");


		int numberOfNumbers = 0;
		int input = file.readInt();
	while(input!=0)
	{
		numberOfNumbers++;
		input = file.readInt();
	}
		square.setn(numberOfNumbers);

		file.close();
		file = new EasyReader("square.dat");

		int test = 0;
	if(!square.meetsRequirementOne())
	{
		System.out.println("This is not a magic square because there are not n squared numbers for some n.");
	}
	else
	{
		test++;
		input = file.readInt();
	while(input != 0)
	{
		square.add(input);
		input = file.readInt();
	}
	}
	if(test==1 && square.meetsRequirementTwo())
		test++;
	else
		System.out.println("Passed Requirement 1! This is not a magic square because each of the numbers do not occur exactly once.");

	if(test==2 && square.meetsRequirementThree())
		test++;
	else
		System.out.println("Passed Requirement 2！This is not a magic square because the sums of the rows, columns, and diagonals are not equal.");

	if(test==3 || square.isMagicSquare())
		System.out.println("This is a magic square!");
	}

}
