package Lecture_04;


import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the unit price of the product: ");
        double price = scanner.nextDouble();

        System.out.println("Enter the quantity of the product: ");
        double quantity = scanner.nextDouble();

        double totalPrice = price * quantity;

        double discountRate = 0.0;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        }

        double totalDiscountAmount = totalPrice * discountRate;
        double discountedPrice = totalPrice - totalDiscountAmount;

        System.out.println("Discount: " + totalDiscountAmount + "$ (" + (discountRate * 100) + "%)");
        System.out.println("The revenue from sale: " + discountedPrice + "$");
    }
}

