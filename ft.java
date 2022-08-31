import java.util.Scanner;
public class ft {
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Starting inches:");
        int initialInches = scanner.nextInt();
        int miles = initialInches/63360;
        int yards = (initialInches-(miles*63360))/36;
        int feet = (initialInches-(miles*63360)-(yards*36))/12;
        int inches = (initialInches-(miles*63360)-(yards*36)-(feet*12));
        System.out.println("Miles: " + miles);  
        System.out.println("Yards: " + yards);  
        System.out.println("Feet: " + feet);  
        System.out.println("Inches: " + inches);  
        scanner.close();
    }
}
