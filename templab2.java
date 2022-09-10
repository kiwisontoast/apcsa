import java.util.Scanner;


public class templab2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
        Boolean continueOn=true;
        do{		
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
        System.out.print("Want to try again?");
        String temporary= in.nextLine();
		if(temporary =="y"){
        }
        if(temporary=="n"){
            continueOn=false;
        }
    }while(continueOn=true);
    in.close();
		// write the code to complete the lab 
		
		
	}
}