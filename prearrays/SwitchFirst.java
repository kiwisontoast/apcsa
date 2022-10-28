//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SwitchFirst
{
   public static String go( String a, String b )
	{
		String output="";
		String endOfFirst = a.substring(1,a.length());
		String startOfSecond = b.substring(0,1);
		output = startOfSecond+endOfFirst;
		return output;
	}
}