//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list
	public static List<Integer> go(  List<Integer> ray )
	{
		int last = ray.get(ray.size()-1);
		List<Integer> greator = new ArrayList<Integer>();
		for (int val : ray)
			if (val > last)
				greator.add(val);
		return greator;
	}
}