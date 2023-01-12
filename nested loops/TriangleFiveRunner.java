
import java.lang.System.*;
import java.util.Scanner;
public class TriangleFiveRunner
{
   public static void main( String args[] )
   {

   		Scanner keyboard = new Scanner(System.in);
	   	String choice="";
		do{
			System.out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
		
			
				//static methods can be called using the class name
			System.out.println(TriangleFive.go( big ) );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}