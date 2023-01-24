//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				grid[i][j] = vals[(int) Math.floor(Math.random()*vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int biggestVal = -1;
		String val = "";
		for (String letter : vals)
		{
			int c = countVals(letter);
			if (c > biggestVal)
			{
				biggestVal = c;
				val = letter;
			}
		}
		return val;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int c = 0;
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{	
				if (grid[i][j] == val)
					c++;
			}
		}
		System.out.println(val + " occurs "+c+" times");
		return c;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[0].length; j++)
			{
				output+=grid[i][j];
			}
			output+="\n";
		}
		return output;
	}
}