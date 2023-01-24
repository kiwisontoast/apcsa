//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming2Runner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner f = new Scanner (new File("matsum.dat"));
	   	int times = f.nextInt();
    	MatrixSumming2 ms = new MatrixSumming2();
    	for( int dx = 0; dx < times; dx++ )
    	{
    		int r = f.nextInt();
    		int c = f.nextInt();
    		System.out.println("The sum of " + r + "," + c + " is "  + ms.sum(r,c) );
    	}
	}
}



