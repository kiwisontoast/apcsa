//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		if (ray.size() == 0) {return -1;}

		int firstOdd = -1;
		for (int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) % 2 == 1)
			{
				firstOdd = i;
				break;
			}
		}

		if (firstOdd == -1)
			return -1;

		int nextEven = -1;
		for (int i = firstOdd+1; i < ray.size(); i++)
		{
			if (ray.get(i) % 2 == 0)
			{
				nextEven = i;
				break;
			}
		}

		return nextEven == -1? -1: nextEven-firstOdd;
	}
}