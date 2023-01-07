//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go(int[] ray)
	{		
		for (int i = 0; i < ray.length; i++)
			for (int j = 0; j < ray.length; j++)
				if (ray[i] == ray[j] && i!=j)
					return false;

		return true;
	}
}