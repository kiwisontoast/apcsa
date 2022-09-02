// Name
//Dev Shroff
// Date
//8/29/22
/* Complete the main method below
 * Write code to generate a random number between 1 and 3 inclusive
 * based on the number generated perform the corresponding calculation
 *
 */

public class MathClassLab
{
	public static void main (String args[])
	{
		int n= (int)(Math.random()*3+1);


		if (n==1)
		{
			//write code to find and display the area of a circle with radius 10 units. Must use Math.PI
			double Area = (Math.PI)*((10)*(10)); 
			System.out.println(Area);
		}
		
		if (n==2)
		{
			//write code to find and display the volume of a sphere with radius 10 units. Must use Math.PI
			double Volume = (4.0/3)*(Math.PI)*((10)*(10)*(10));
			System.out.print(Volume);
		}
		
		if (n==3)
		{
			//write code to find and display the distance between (5, 5) and (12, 6)
			// use the distance formula 
			double distance = Math.sqrt((6 - 5) * (6 - 5) + (12 - 5) * (12 - 5));
			System.out.println(distance);
		}
			
			
	}
}

