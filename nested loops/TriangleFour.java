

public class TriangleFour
{
	public  static String go( String let, int size)
	{
		String output="";
		for(int i=0;i<=size;i++){
			for(int j=0;j<size-i;j++){
				System.out.print(" ");
			}
			
			for(int x=0;x<i;x++){
				System.out.print(let);
			}
			
			
			System.out.println();
		}
		return output;
	}
}