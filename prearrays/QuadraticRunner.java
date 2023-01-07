//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;


public class QuadraticRunner
{
	public static void main( String[] args )
	{
		//use a Scanner for keyboard input		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		System.out.println("The first root is " +Quadratic.getRootOne(num1, num2, num3));
		System.out.println("The second root is " +Quadratic.getRootTwo(num1, num2, num3));


		scan.close();
		//add test cases
	}
}

/*

Sample Data :
5 -8 3
3 2 -7
9 6 1


Sample Output : 
Enter a :: 5
Enter b :: -8
Enter c :: 3


rootone :: 1.00
roottwo :: 0.60




Enter a :: 3
Enter b :: 2
Enter c :: -7


rootone :: 1.23
roottwo :: -1.90




Enter a :: 9
Enter b :: 6
Enter c :: 1


rootone :: -0.33
roottwo :: -0.33

*/