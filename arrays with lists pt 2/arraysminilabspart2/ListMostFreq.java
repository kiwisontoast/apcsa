//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go( List<Integer> ray )
	{
		int largest = ray.get(0);
		int largestCount = 0;

		for (int i = 0; i < ray.size(); i++)
		{
			int c = 0;
			for (int j = 0; j < ray.size(); j++)
				if (ray.get(j) == ray.get(i))
					c++;
			
			if (c > largestCount)
			{
				largestCount = c;
				largest = ray.get(i);
			}
		}

		return largest;
	}
}