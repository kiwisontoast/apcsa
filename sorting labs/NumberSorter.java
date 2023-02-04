//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

   private static int getNumDigits(int number)
   {
      int count = 0;
      for (int k = 0; k < number; count++){
         number/=10;
      }
      return count;
   }

   public static int[] getSortedDigitArray(int number)
   {
      int[] Sorted = new int [NumberSorter.getNumDigits(number)];
      for (int num2 = 0; num2<Sorted.length; num2++)
      {
         Sorted[num2] = number%10;
         if (number > 0) 
         {
            number/=10;
         }
      }
      for (int k = 0; k < Sorted.length-1; k++){
         int small = k;
         for (int m = k+1; m <Sorted.length; m++){
            if(Sorted[small] > Sorted[m]){
               small = m;
            }
         }
         int temp = Sorted[small];
         Sorted[small] = Sorted[k];
         Sorted[k] = temp;
      } 
      return Sorted;
   }
}