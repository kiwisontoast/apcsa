//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go(int[] ray)
	{
		int largest = ray[0];
		int largestCount = 0;

		for (int i = 0; i < ray.length; i++)
		{
			int c = 0;
			for (int j = 0; j < ray.length; j++)
				if (ray[j] == ray[i])
					c++;
			
			if (c > largestCount)
			{
				largestCount = c;
				largest = ray[i];
			}
		}

		return largest;	}
}