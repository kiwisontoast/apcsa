import java.util.Scanner;
public class rectangle {
    public static void main(String[] args)
    {   
    System.out.println("The perimeter of a rectangle with sides of 12 and 5 is "+(((2*12.0)+(2*5.0))));
    System.out.println("The perimeter of a rectangle with sides of 131 and 75 is "+((2*131.0)+(2*75.0)));
    System.out.println("The perimeter of a rectangle with sides of 20 and 25 is "+((2*20.0)+(2*25.0)));
    System.out.println("The perimeter of a rectangle with sides of 9 and 256 is "+((2*9.0)+(2*256)));
    System.out.println("The perimeter of a rectangle with sides of 36 and 72 is "+((2*36.0)+(2*72)));
    System.out.println("The perimeter of a rectangle with sides of 8 and 6 is "+((2*8.0)+(2*6)));
    System.out.println("The perimeter of a rectangle with sides of 18 and 16 is "+((2*18.0)+(2*16)));
    try (Scanner object = new Scanner(System.in)) {
        System.out.println("Enter length: ");
        double length = object.nextInt();
        System.out.println("Enter width: ");
        double width = object.nextInt();
        double perimeter = ((2*length)+(2*width));
        System.out.println("The perimeter of the shape is " + perimeter);
    }
    }    
}
