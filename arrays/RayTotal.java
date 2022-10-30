//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayTotal
{
	public static int go(int[] ray)
	{
		int count=0;
		for(int i=0;i<=ray.length-1;i++){
			count+=ray[i];
		}
		return count;
	}
}