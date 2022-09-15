//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LeaveOut
{
	//pre : a.length() > 1
	//post : string returned minus character at i
   public static String go( String a, int i)
	{
		String part1=a.substring(0,i);
		String part2=a.substring(i+1, a.length());
		String output= part1+part2;
		return output;
	}
}