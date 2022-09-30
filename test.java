public class test 
{
    public static void main(String[] args)
    {
//     String one="nm";
String two="sdyfguh8fuxfhcgvkj";
// 	int x = temp.stringCounter(one, two);
// System.out.println(x);
	// temp.countComma(one);
	// System.out.println(temp.min(1,2,3));
	System.out.println(temp.reverse(two));
	System.out.println(temp.palindrome(two));


   

}
}
class temp{
	// public static void reverse(String s) {
	// 	String reverse = "";
	// 	for (int i = s.length() - 1; i >= 0; i--) {
	// 		reverse += s.charAt(i);
	// 	}
	// 	System.out.println(reverse);
	// }
	public static void countComma(String str)
{
int count = 0;
for (int i =0;i<str.length();i++){
if(str.charAt(i)==','){
count++;
System.out.println(count);
}
}
}

public static int max(int a, int b, int c){
int max=0;
if( a > b &&a>c){
	max=a;
}
else if( b > a &&b>c){
	max=b;
}
else{
	max=c;
}
return max;
}

public static int min(int a, int b, int c){
	int min=0;
	if( a < b &&a<c){
		min=a;
	}
	else if( b < a &&b<c){
		min=b;
	}
	else{
		min=c;
	}
	return min;
	}

	public static int stringCounter(String a,String b){
		int count = 0;
		for(int i =0;i<=b.length();i++){
			int wordIndex = b.indexOf(a);
			if(wordIndex>=0){
				count++;
				b=b.substring(wordIndex + a.length());

			}
		}
		return count;
	}

	public static String reverse(String a){
		String reverse="";
		for (int i =a.length()-1;i>=0;i--){
			reverse+=a.charAt(i)+"";
		}
return reverse;
	}
	public static String palindrome(String a){
		String reverse="";
		String output="";
		for (int i =a.length()-1;i>=0;i--)
		{
			reverse+=a.charAt(i)+"";
		}
			if(a==reverse)
			{
				output="It is a palindrome";		
			}
			else if(a!=reverse)
			{
				output="It is not a palindrome";
			}
		
			return output;
		}
	}
