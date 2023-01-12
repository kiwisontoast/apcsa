

public class Box
{
	public  static String go( char let, int size)
	{
		String output="";
		for (int lineCount = 0; lineCount <size; lineCount++) 
		{
			for (int charCount = 0; charCount<size-lineCount; charCount++) 
			{
				int charNum = (int) let+charCount;
				if(charNum>122)
					charNum = charNum - 26;
			  	char c = (char)(charNum);
			  	for(int num=size-charCount;num>0;num--)
			  	{
			 		System.out.print(c);
				}
				System.out.print("\t");	
			}
			System.out.print("\n");			
		}
		return output;
	}
}