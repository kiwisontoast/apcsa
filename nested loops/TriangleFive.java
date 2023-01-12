

public class TriangleFive
{
	public  static String go( int size)
	{
		String output="";
		for(int i=0;i<size;i++){
			for(int j=0;j<size-i;j++){
				System.out.print("*");
			}
			for(int x=0;x<i+1;x++){
				System.out.print("#");
			}
			System.out.println();
		}
		return output;
	}
}