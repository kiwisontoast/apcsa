import java.util.Scanner;

public class Lab05a2vst
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter the 1st numerator ----> ");
      int num1 = keyboard.nextInt();
      System.out.print("\nEnter the 1st denominator --> ");
      int den1 = keyboard.nextInt();
      System.out.print("\nEnter the 2nd numerator ----> ");
      int num2 = keyboard.nextInt();
      System.out.print("\nEnter the 2nd denominator --> ");
      int den2 = keyboard.nextInt();
      System.out.println();

      Rational r1 = new Rational(num1,den1);
      Rational r2 = new Rational(num2,den2);
      Rational r3 = new Rational();

      r3.showMultiply(r1,r2);    // required for 80-points
      r3.showDivide(r1,r2);      // required for 80-points
      r3.showAdd(r1,r2);         // required for 100-points
      r3.showSubtract(r1,r2);    // required for 100-points
   }
}

class Rational
{
   private int num;    
   private int den;    

   // Required for 80-points
   public Rational()
   {
      num = 0;
      den = 1;
   }

   // Required for 80-points
   public Rational(int n, int d)
   {
      num = n;
      den = d;
   }
   
   // Required for 80-points
   public String getRational()
   {
      return num + "/" + den;
   }

   // Required for 80-points
   private int getGCF(int n1,int n2)
   {
      int rem = 0;
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

   // Required for 80-points
   public String getReduced()
   {
      int gcf = getGCF(num,den);
      int reducedNum = num/gcf;
      int reducedDen = den/gcf;
     
      return reducedNum + "/" + reducedDen;
   }

   // Required for 80-points
   public void showMultiply(Rational r1, Rational r2)
   {  
      String rat1 = r1.getRational();
     
      String rat2 = r2.getRational();
    
       int numerator = r1.num * r2.num;
       int denominator = r1.den * r2.den;
       Rational result = new Rational(numerator,denominator);
       String resultf = result.getReduced();
     
      System.out.println();
      System.out.println(rat1 + " * " + rat2 + " = " + resultf);
   }
   
   // Required for 80-points
   public void showDivide(Rational r1, Rational r2)
   {  
    String rat1 = r1.getRational();
     
    String rat2 = r2.getRational();
  
     int numerator = r1.num * r2.den;
     int denominator = r1.den * r2.num;
     Rational result = new Rational(numerator,denominator);
     String resultf = result.getReduced();
   
    System.out.println();
    System.out.println(rat1 + " / " + rat2 + " = " + resultf);
   }
   
   // Required for 100-points
   public void showAdd(Rational r1, Rational r2)
   {  
    String rat1 = r1.getRational();
     
    String rat2 = r2.getRational();
  
     int numerator = r1.num * r2.den + r2.num * r1.den;
     int denominator = r1.den * r2.den;
     Rational result = new Rational(numerator,denominator);
     String resultf = result.getReduced();
   
    System.out.println();
    System.out.println(rat1 + " + " + rat2 + " = " + resultf);
   }

   // Required for 100-points
   public void showSubtract(Rational r1, Rational r2)
   {  
    String rat1 = r1.getRational();
     
    String rat2 = r2.getRational();
  
     int numerator = r1.num * r2.den - r2.num * r1.den;
     int denominator = r1.den * r2.den;
     Rational result = new Rational(numerator,denominator);
     String resultf = result.getReduced();
   
    System.out.println();
    System.out.println(rat1 + " - " + rat2 + " = " + resultf);
   }
}
