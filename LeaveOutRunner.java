//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LeaveOutRunner
{
	public static void main( String args[] )
	{
		LeaveOut s = new LeaveOut();		
		System.out.println( s.go( "dog",1 ) ) ;
		System.out.println( s.go( "aplus",2 ) ) ;
		System.out.println( s.go( "catgiraffe",3 ) ) ;
		System.out.println( s.go( "ap",1 ) ) ;
		System.out.println( s.go( "pluscat",4 ) ) ;
		System.out.println( s.go( "aplusdog#13337#",9 ) ) ;
		System.out.println( s.go( "code",2 ) ) ;
		System.out.println( s.go( "wow",1 ) ) ;
		System.out.println( s.go( "catsand",0 ) ) ;	
	}
}