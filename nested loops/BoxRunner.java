
import java.lang.System.*;
import java.util.Scanner;
public class BoxRunner
{
   public static void main( String args[] )
   {

   		Scanner keyboard = new Scanner(System.in);
	   	String choice="";
		do{
			System.out.print("Enter the letter : ");
         char value = keyboard.next().charAt(0);
			
			System.out.print("Enter a number  : ");
			int big = keyboard.nextInt();
			
				//static methods can be called using the class name
			System.out.println(Box.go( value, big ) );

			System.out.print("Do you want to enter more data? (y/n) : ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}