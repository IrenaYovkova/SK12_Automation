package Lecture_06_Methods;

import java.util.Scanner;
////ООП
//public class NumbersCheckerPalindrom {
//
//    public static boolean isPalindrome(int number) {
//        String numStr = String.valueOf(number);
//
//        int length = numStr.length();
//
//        for (int i = 0; i < length / 2; i++) {
//            if (numStr.charAt(i) != numStr.charAt(length - i - 1)) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a non-negative integer: ");
//        int userInput = scanner.nextInt();
//
//        if (userInput >= 0) {
//            boolean result = isPalindrome(userInput);
//
//            if (result) {
//                System.out.println(userInput + " is a palindrome.");
//            } else {
//                System.out.println(userInput + " is not a palindrome.");
//            }
//        } else {
//            System.out.println("Please enter a non-negative integer.");
//        }
//
//        scanner.close();
//    }
//}
public class NumbersCheckerPalindrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число: ");
        int userInput = scanner.nextInt();

        if (userInput >= 0) {
            boolean result = isPalindrome(userInput);

            if (result) {
                System.out.println(userInput + " е палиндром.");
            } else {
                System.out.println(userInput + " не е палиндром.");
            }
        } else {
            System.out.println("Моля, въведете неотрицателно число.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);

        int length = numStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}