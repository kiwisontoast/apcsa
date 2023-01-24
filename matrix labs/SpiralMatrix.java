//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SpiralMatrix
{
	//define a matrix
	int[][] m;
	int[][] directions = {
		{0, 1}, 
		{1, 0},
		{0, -1},
		{-1, 0},
	};

	public SpiralMatrix()
	{
	}

	public SpiralMatrix(int size)
	{
		m = new int[size][size];
	}
	
	public void setSize(int size)
	{
	}

	public void createSpiral()
	{
		int speed = m.length;
		int d = 0;
		int x = 0;
		int y = -1;
		int num = 1;
		while (m[x+directions[d][0]][y+directions[d][1]] == 0)
		{
			for (int i = 0; i < speed; i++)
			{
				x += directions[d][0];
				y += directions[d][1];
				m[x][y] = num;
				num++;
			}
			d = (d+1)%4;
			if (d==1)
				speed--;
			else if (d==3)
				speed--;
		}
	}

	public String toString( )
	{
		int numSpacing = 4;
		String output="";
		for (int y = 0; y < m[0].length; y++)
		{
			for (int x = 0; x < m.length; x++)
			{
				String num = String.valueOf(m[x][y]);
				output += num;
				for (int i = num.length(); i < numSpacing; i++)
				{
					output += " ";
				}
			}
			output += "\n";
		}
		return output;
	}
}