//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
		int last = ray.get(ray.size()-1);
		int lastCount = 0;
		for (int val : ray)
			if (val == last)
				lastCount++;
		return lastCount > 1;
	}
}