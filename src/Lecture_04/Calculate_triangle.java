package Lecture_04;

import java.util.Scanner;

public class Calculate_triangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first angle in degrees: ");
        double angle1 = scanner.nextDouble();

        System.out.println("Enter the second angle in degrees: ");
        double angle2 = scanner.nextDouble();

        System.out.println("Enter the third angle in degrees: ");
        double angle3 = scanner.nextDouble();

        if (isValidTriangle(angle1, angle2, angle3)) {
            System.out.println("The triangle can be built.");

            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("It is an equilateral triangle.");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("It is a right-angled triangle.");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("It is an obtuse triangle.");
            } else {
                System.out.println("It is an acute triangle.");
            }
        } else {
            System.out.println("The triangle cannot be built with the given angle values.");
        }
    }
    private static boolean isValidTriangle(double angle1, double angle2, double angle3) {
        return (angle1 + angle2 + angle3 == 180);
    }
}