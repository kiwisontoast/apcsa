//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortRunner
{
	public static void main( String args[] ) throws IOException
	{
		WordSort ws = new WordSort("abc ABC 12321 fred alexander");
		ws.sort();
		System.out.println( ws );

		ws = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		ws.sort();
		System.out.println( ws );

		ws = new WordSort("b x 4 r s y $");
		ws.sort();
		System.out.println( ws );

		ws = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		ws.sort();
		System.out.println( ws );
	}
}