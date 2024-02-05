package Lecture_04;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work!");
        } else {
            System.out.println("You are not eligible to work. You must be 16 years or older.");
        }

       System.out.println("Enter a digit (1-7): ");
       int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("The day of the week is Sunday");
                break;
            case 2:
                System.out.println("The of the week is Monday");
                break;
            case 3:
                System.out.println("The of the week is Tuesday");
                break;
            case 4:
               System.out.println("The day of the week is Wednesday");
                break;
            case 5:
                System.out.println("The  day of the week is Thursday");
                break;
            case 6:
                System.out.println("The  day of the week is Friday");
                break;
            case 7:
                System.out.println("The  day of the week is Saturday");
                break;
            default:
                System.out.println("Invalid input. Please enter a digit between 1 and 7.");

        }
    }
}
