//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BiggestRunner
{
	public static void main( String args[] ) throws Exception
	{
				
		int[][] f = {{1,2,3},{5,5,5,5}};
		int[][] g = {{1,2,3},{-5},{11},{21,2}};
        int[][] h = {{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}};
        int[][] j = {{-20, -40},{-234,-234234 } };

		System.out.println( "The biggest number is :: " + Biggest.getBig( f ) );
		System.out.println( "The biggest number is :: " + Biggest.getBig( g ) );
		System.out.println( "The biggest number is :: " + Biggest.getBig( h ) );
		System.out.println( "The biggest number is :: " + Biggest.getBig( j ) );	
	}
}



