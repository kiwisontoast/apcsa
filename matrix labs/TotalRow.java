//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	  ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < m.length; i++)
        {
          int s = 0;
          for (int j = 0; j < m[i].length; j++)
          {
            s+= m[i][j];
          }
          list.add(s);
        }
        // for (int i = 0; i < m.length; i++)
        // {
        //   int biggest = m[i][0];
        //   for (int j = 1; j < m[i].length; j++)
        //   {
        //     if (biggest < m[i][j])
        //       biggest = m[i][j];
        //   }
        //   list.add(biggest);
        // }

        return list;
    }
}
