//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayGetFirst
{
	//method go will return an array
	//containing all values > the first value in the array
	//from the array parameter ray
	public static int[] go(int[] ray)
	{
		int first = ray[0];
		int largerCount = 0;

		for (int i = 1; i < ray.length; i++)
			if (ray[i] > first)
				largerCount++;

		int[] larger = new int[largerCount];
		int li = 0;
		for (int i = 1; i < ray.length; i++)
			if (ray[i] > first)
			{
				larger[li] = ray[i];
				li++;
			}

		return larger;
	}
}