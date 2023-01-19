//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SpiralMatrixRunner
{
	public static void main( String args[] ) 
	{
		SpiralMatrix it = new SpiralMatrix( 3 );
		it.createSpiral();
		System.out.println( it );
		
		it = new SpiralMatrix( 7 );
		it.createSpiral();
		System.out.println( it );
		
		it = new SpiralMatrix( 6 );
		it.createSpiral();
		System.out.println( it );
	}
}