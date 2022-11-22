//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static List<Integer> go( List<Integer> ray )
	{
		List<Integer> greater = new ArrayList<Integer>();
		int c = 0;
		for (int val : ray)
		{
			if (val > 11)
			{
				c++;
				greater.add(val);
				if (c == 3)
					break;
			}
		}
		return greater;
	}
}