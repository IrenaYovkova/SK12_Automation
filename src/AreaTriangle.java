import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side a:  ");
        double a = scanner.nextInt();

        System.out.println("Enter the length of side b: ");
        double b = scanner.nextInt();

        System.out.println("Enter the length of side c: ");
        double c = scanner.nextInt();

        double s = (a + b + c)/2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));


        System.out.println("The area of the triangle is: " + area);

        scanner.close();


    }
}
