//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid x = new Grid(7, 7, new String[]{"A","B","D","#","G","3"});
		System.out.println( x );
		System.out.println( x.findMax( new String[]{"X","A","B"}) + " occurs the most" );
	}
}