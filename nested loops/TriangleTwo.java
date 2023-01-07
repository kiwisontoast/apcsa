

public class TriangleTwo
{
	public  static String go( String let, int size)
	{
		String output="";
		for(int i=size;i>=0;i--){
			for(int j=0;j<i;j++){
				System.out.print(let);
			}
			System.out.println();
		}
		return output;
	}
}