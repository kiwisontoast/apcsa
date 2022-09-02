// Mrs. Lorena

import java.util.Scanner;


public class TempLab
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("OK, mate, what's the temperature outside? ");
		int temp = in.nextInt();
		if(temp >=75){
			System.out.println("Looks good for swimming");
		}
		if((temp >60)&&(temp<=85)){
			System.out.println("Looks good for tennis");
		}
		if((temp >10)&&(temp<=32)){
			System.out.println("Looks good for skiing");
		}
		if(temp <=10){
			System.out.println("Looks good for checkers");
		}
		if((temp >32)&&(temp<=70)){
			System.out.println("Looks good for soccer");
		}
		in.close();
		// write the code to complete the lab 
		
		
	}
}


