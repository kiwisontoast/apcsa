//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class AvgLenRunner
{
	public static void main( String args[] )
	{
		AvgLen s = new AvgLen();		
		System.out.println( s.go( "dog", "cats" ) ) ;
		System.out.println( s.go( "aplus", "pigs" ) ) ;
		System.out.println( s.go( "catgiraffe", "apluscompsci" ) ) ;
		System.out.println( s.go( "ap", "aplus" ) ) ;
		System.out.println( s.go( "pluscat", "dogsaplus" ) ) ;
		
		//you can call static methods on a reference
		//or directly on the class name - Math.random() is another example
		
		System.out.println( AvgLen.go( "#", "#" ) ) ;
		System.out.println( AvgLen.go( "aplusdog#13337#", "pigaplusprogram" ) ) ;
		System.out.println( AvgLen.go( "code", "code1234" ) ) ;
		System.out.println( AvgLen.go( "wow", "eplus" ) ) ;
		System.out.println( AvgLen.go( "catsand" , "aplusdogsaplus" ) ) ;
		System.out.println( AvgLen.go( "7", "77777" ) ) ;		
	}
}