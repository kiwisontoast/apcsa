

public class TriangleThree
{
	public  static String go( String let, int size)
	{
		String output="";
		for(int i=0;i<size;i++){
			for(int j=0;j<size-i-1;j++){
				System.out.print(" ");
			}
			for(int x=0;x<i+1;x++){
				System.out.print(let);
			}
			System.out.println();
		}
		return output;
	}
}