import java.util.*;

public class ArraysMergeLab
{
public static void main ( String args[] )
{
    int [ ] x = { 2,3, 11,56,350};
    int [ ] y = { 4,6, 17,18,20, 100,200, 300, 400, 1350};
    System.out .println("Arrays before merge");
        for (int temp:x)
    System.out.print (temp+" ");
        System.out.println();
    for(int temp:y)
    System.out.print(temp+" ");
            
    System.out.println("\n\nMerged Array");
    System.out.println(merge(y,x));
}
   
public static String merge( int [] a, int [] b )
{
      int[] result = new int[a.length + b.length];
      int aIndex = 0;
      int bIndex = 0;
      int rIndex = 0;
     
      while (aIndex < a.length && bIndex < b.length)
      {
         if (a[aIndex] < b[bIndex]){
            result[rIndex] = a[aIndex];
            aIndex++;
            rIndex++;
         }
         else {
            result[rIndex] = b[bIndex];
            bIndex++;
            rIndex++;
         }
      }
      while (aIndex < a.length)
      {
         result[rIndex] = a[aIndex];
         aIndex++;
         rIndex++;
      }
      while (bIndex < b.length)
      {
         result[rIndex] = b[bIndex];
         bIndex++;
         rIndex++;
      }
     
      return Arrays.toString(result);
   }
}
