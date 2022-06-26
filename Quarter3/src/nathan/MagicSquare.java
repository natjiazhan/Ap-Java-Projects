package nathan;

public class MagicSquare 
{
	private int n;
	private int numberOfNumbers;
	private int[][] result;
	private boolean isMagic;
	private int z;

	public MagicSquare()
	{
		numberOfNumbers = 0;
		isMagic = false;
		z = 0;

	}
	public void setn(int i)
	{
		numberOfNumbers = i;
	}
	public void add(int i)
	{
		int row = z/n;
		int col = z%n;
		result[row][col] = i;
		z++;
	}


	public boolean meetsRequirementOne()
	{
		if(Math.sqrt(numberOfNumbers)%1<0.0000001)
		{
			n = (int)Math.sqrt(numberOfNumbers);
			result = new int[n][n];
			return true;
		}
		return false;
		}


	public boolean meetsRequirementTwo()
	{
		boolean ans2 = true;
		int[] difNum = new int[result.length*result[0].length+1];
		int y = 0;
		int q = 0;
		for(int r = 0; r<result.length; r++)
		{
			for(int c = 0; c<result[0].length; c++)
			{
				y++;
				q = result[r][c];
				difNum[q] = y;
				y=0;
			}
			y=0;
		}
		for(int i =1; i<difNum.length;i++)
		{
			if(difNum[i]!=1)
				ans2 = false;
		}
		return ans2;
	}



	public boolean meetsRequirementThree()
	{
	boolean ans3 = true;
	int diagSum1 = 0;
	int diagSum2 = 0;
	int rowSum = 0;
	int colSum = 0;
	        for (int i = 0; i < n; i++)
	        {
	            diagSum1 += result[i][i];
	            diagSum2 += result[i][n-1-i];
	        }
	        if(diagSum1!=diagSum2)
	            ans3 = false;

	        for (int r = 0; r < n; r++)
	        {

	            for (int c = 0; c < n; c++)
	            {
	                rowSum += result[r][c];
	                colSum += result[c][r];
	            }
	            if (rowSum != colSum || colSum != diagSum1)
	                ans3 = false;
	            rowSum = 0;
	            colSum = 0;
	        }
	 
	 
	        return ans3;
	    }

	public boolean isMagicSquare()
	{
	if(meetsRequirementOne() == true && meetsRequirementTwo() == true && meetsRequirementThree() == true)
	isMagic = true;
	return isMagic;
	}

}
