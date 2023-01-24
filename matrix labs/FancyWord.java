//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FancyWord
{
	private String[][] mat;

   public FancyWord(String s)
	{
		int length = s.length();
		mat = new String[length][length];

		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[0].length; j++)
			{
				boolean isValid = false;
				if (i == 0 || i == length-1)	
					isValid = true;
				else if (j == i || j==s.length()-i-1)
					isValid = true;
				
				mat[i][j] = isValid? ""+s.charAt(j):" ";
			}
		}
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[0].length; j++)
			{
				output+=mat[i][j];
			}
			output+="\n";
		}
		return output+"\n\n";
	}
}