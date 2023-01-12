import java.lang.System.*;
import java.util.Scanner;

public class BoxWordRunner
{

	public static void main( String args[] )
   {

   		Scanner keyboard = new Scanner(System.in);
	   	String choice="";
		do{
			
			System.out.print("Enter a word : ");
			String value = keyboard.next();
			
				//static methods can be called using the class name
			System.out.println(BoxWord.go( value ) );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}

