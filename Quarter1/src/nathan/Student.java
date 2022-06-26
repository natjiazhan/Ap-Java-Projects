package nathan;

public class Student 
{
		private String name;
		private int totalscore;
		private int numoftest;
		
		public Student(String name)
		{
			this.name = name;
			totalscore = 0;
			numoftest = 0;
			
		}
		public String getName()
		{
			return name;
		}
		public int getNumOfTest()
		{
			return numoftest;
		}
		public void addQuiz(int score)
		{
			totalscore = totalscore + score;
			numoftest++;
		}
		public double getTotalScore()
		{
			return (double)totalscore;
		}
		public double getAverageScore()
		{
			return (double)(totalscore)/numoftest;
		}
}
