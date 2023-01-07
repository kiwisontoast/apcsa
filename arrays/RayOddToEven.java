//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		if (ray.length == 0) {return -1;}

		int firstOdd = -1;
		for (int i = 0; i < ray.length; i++)
		{
			if (ray[i] % 2 == 1)
			{
				firstOdd = i;
				break;
			}
		}

		if (firstOdd == -1)
			return -1;

		int nextEven = -1;
		for (int i = firstOdd+1; i < ray.length; i++)
		{
			if (ray[i] % 2 == 0)
			{
				nextEven = i;
				break;
			}
		}

		return nextEven == -1? -1: nextEven-firstOdd;
	}
}