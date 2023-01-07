//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.lang.Math;

public class Quadratic
{
	public static double getRootOne( int a, int b, int c )
	{
		return (-b+Math.sqrt(b*b - 4*a*c))/(2*a);

	}
	
	public static double getRootTwo( int a, int b, int c )
	{
		return (-b-Math.sqrt(b*b - 4*a*c))/(2*a);
	}
}