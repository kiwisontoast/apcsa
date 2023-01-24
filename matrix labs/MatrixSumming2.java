//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixSumming2
{
    private int[][] m = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 0},
        {6, 7, 1, 2, 5},
        {6, 7, 8, 9, 0},
        {5, 4, 3, 2, 1}};   //load in the matrix values

    public int getVal(int r, int c)
    {
        if (r >= 0 && r < m.length && c >= 0 && c < m[0].length)
            return m[r][c];
        return 0;
    }

    public int sum( int r, int c )
    {
        int s = 0;
        for (int i = -1; i < 2; i++)
        {
            for (int j = -1; j < 2; j++)
            {
                s+=getVal(r+i, c+j);
            }
        }
    	return s;
    }

    public String toString()
    {
    	return "";
    }
}
