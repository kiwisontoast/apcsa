//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FirstLast
{
   public static String go( String a, String b )
	{
		String firstLetterOfA = a.substring(0, 1);
		int lengthB = b.length();
		String lastLetterOfB = b.substring(lengthB-1,lengthB);
		return firstLetterOfA+lastLetterOfB;
	}
}