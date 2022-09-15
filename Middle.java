//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Middle
{
	//pre : a.length() > 1
	//post : midddle letter of string a returned
   public static String go( String a )
	{
		String middleLetter = ""+a.charAt(a.length()/2);	
		return middleLetter;
	}
}