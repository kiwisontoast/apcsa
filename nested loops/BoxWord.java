

public final class BoxWord
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public  static String go( String let)
	{ 
		String output="";
        for (int outerCounter = 0; outerCounter < let.length(); outerCounter++)
        {
            for (int innerCounter = 0; innerCounter < let.length(); innerCounter++)
            {
                if (outerCounter == 0){
                    System.out.print(let.charAt(innerCounter));
				}
                else if (outerCounter == let.length()-1){
                    System.out.print(let.charAt(let.length()-1-innerCounter));
				}
                else if (innerCounter == 0){
                    System.out.print(let.charAt(outerCounter));
				}
                else if (innerCounter == let.length()-1){
                    System.out.print(let.charAt(let.length()-1-outerCounter));
				}
                else{
                    System.out.print(" ");
				}
            }
            System.out.print("\n");
        }
        return output+"\n";
	}
}