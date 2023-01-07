//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go( List<Integer> ray )
	{
		for (int i = 0; i < ray.size(); i++)
			for (int j = 0; j < ray.size(); j++)
				if (ray.get(i) == ray.get(j) && i!=j)
					return false;

		return true;
	}
}