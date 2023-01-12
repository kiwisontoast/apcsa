

public class TriangleFour
{
	public  static String go( String let, int size)
	{
		String output="";
		for(int i=size;i>0;i--){
			for(int j=1;j<=size-i;j++){
				System.out.print(" ");
			}
			
			for(int x=1;x<=i;x++){
				System.out.print(let);
			}
			
			
			System.out.println();
		}
		return output;
	}
}