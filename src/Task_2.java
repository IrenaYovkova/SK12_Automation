import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side a:  ");
        int a = scanner.nextInt();

        System.out.println("Enter the length of side b:  ");
        int b = scanner.nextInt();

        System.out.println("Enter the length of side c:   ");
        int c = scanner.nextInt();

        int perimeter = a + b + c;

        System.out.println("The perimeter of the triangle is: " + perimeter);

        scanner.close();

        }


    }

