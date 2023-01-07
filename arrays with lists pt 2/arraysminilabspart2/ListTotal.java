//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int total = 0;
		for (Integer i : ray)
		{
			total += i;
		}
		return total;
	}
}