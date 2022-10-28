public class SocialRunner
{
	public static void main( String args[] )
	{
		Social socialSecurityNumber = new Social();

        socialSecurityNumber.setWord("456-56-234");
        socialSecurityNumber.chopAndAdd();
        System.out.println(socialSecurityNumber);
        
        socialSecurityNumber.setWord("1-1-1");
        socialSecurityNumber.chopAndAdd();
        System.out.println(socialSecurityNumber);

        socialSecurityNumber.setWord("102-2-12");
        socialSecurityNumber.chopAndAdd();
        System.out.println(socialSecurityNumber);

        socialSecurityNumber.setWord("0-0-0");
        socialSecurityNumber.chopAndAdd();
        System.out.println(socialSecurityNumber);
		//add test cases
		
	}
}