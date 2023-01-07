//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
		int[] getNum = new int[3];
		int k = 0;
		for(int i = 0; i < ray.length; i++)
		{
			if(ray[i]>11)
			{
				getNum[k] = ray[i];
				k++;
			}
			if(k==3)
			{
				break;
			}
		}
		return getNum;
	}
}