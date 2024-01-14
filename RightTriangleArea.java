import java.util.Scanner;

public class RightTriangleArea{
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the the right triangle: ");
    double base = scanner.nextDouble();

    System.out.println("Enter the height of the right triangle: ");
    double height = scanner.nextDouble();

    double area = (base * height) / 2;

    System.out.println("The area of the right triange is " + area);

    scanner.close();
    }
            
}