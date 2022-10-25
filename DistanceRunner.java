//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add a Scanner for keyboard input
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 4 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		System.out.println("The distance is " +Distance.getDistance(num1, num2, num3, num4));


		scan.close();
		
		//add test cases					
	}
}

/*

Sample Data :
1 1 2 1
1 1 -2 2
1 1 0 0 
 


Sample Output : 
Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 2
Enter Y2 :: 1
distance == 1.000


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: -2
Enter Y2 :: 2
distance == 3.162


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
distance == 1.414

*/