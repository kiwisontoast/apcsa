import java.util.Scanner;
public class trianglearea {
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter base length:");
        double length = scanner.nextDouble();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();
        double area = (length*height)/2;
        System.out.println("area of triangle is: " + area);  
        scanner.close();
    }
}
