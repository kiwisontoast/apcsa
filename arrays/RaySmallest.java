//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int min=ray[0];
		for(int i=0;i<ray.length;i++)
		{
			if(ray[i]<min)
			{
				min=ray[i];
			}
		}
		return min;
	}
}