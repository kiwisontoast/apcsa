// Lab05a1vst.java
// The Rational Class Program I
// This is the student starting Version of the Lab05a1 assignment.
import java.util.Scanner;

public class Lab05a1vst
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter the numerator ----> ");
      int num = keyboard.nextInt();
      System.out.print("\nEnter the denominator --> ");
      int den = keyboard.nextInt();
      Rational r = new Rational(num,den);
      r.displayData();
   }
}


class Rational
{
   private int num;
   private int den;

   // Complete for 80-Points
   public Rational(int n, int d) 
   {
      num=n;
      den=d;
   }

   // Complete for 80-Points
   public double getDecimal() 
   { 
      return (double)num/den;
   }
   
   // Complete for 80-Points
   public String getRational() 
   { 
      return num+"/"+den; 
   }

   // Complete for 100-Points
   public String getReduced() 
   {
      int gcf = getGCF(num,den);
   int reducedNum = num/gcf;
   int reducedDen = den/gcf;
   	  
   return reducedNum + "/" + reducedDen;
      
   }

   // Method for 80-Points; Change for 100-Points
   public void displayData()
   {
      System.out.println();
      System.out.println(getRational() + " equals " + getDecimal());
      System.out.println("and reduces to "+getReduced());
   }

   // Use the helper method getGCF for 100-Points// private methods are helper methods
   
   private int getGCF(int n1,int n2)
   {   int rem = 0;
      int gcf = 1;
      do
      {
         rem = n1 % n2;
         if (rem == 0)
            gcf = n2;
         else
         {
            n1 = n2;
            n2 = rem;
         }
      }
      while (rem != 0);
       
      return gcf;
   
   }
}








