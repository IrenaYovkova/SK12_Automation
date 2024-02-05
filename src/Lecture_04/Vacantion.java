package Lecture_04;

import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of vacation (Beach or Mountain): ");
        String vacationType = scanner.nextLine();

        System.out.println("Enter your budget per day per person: ");
        double budgetPerDay = scanner.nextDouble();

        if ("Beach".equalsIgnoreCase(vacationType)) {
            if (budgetPerDay < 50) {
                System.out.println("You should go to Bulgaria for your beach vacation!");
            } else {
                System.out.println("You should go outside Bulgaria for your beach vacation!");
            }
        } else if ("Mountain".equalsIgnoreCase(vacationType)) {
            if (budgetPerDay < 30) {
                System.out.println("You should go to Bulgaria for your mountain vacation!");
            } else {
                System.out.println("You should go outside Bulgaria for your mountain vacation!");
            }
        } else {
            System.out.println("No information about this type of vacation. Please choose Beach or Mountain.");
        }
    }
}


