package Lecture_06_Methods;

//public class IsEven {
//
//    public static int evenNumber (int a){
//        if ( a %2 == 0){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(evenNumber(7));
//
//    }
//}
//public class IsEven {
//
//    public static boolean isEven(int a) {
//        return a % 2 == 0;
//    }
//
//    public static void main(String[] args) {
//        int number = 7; // Променете стойността на 'number' според нуждите си
//
//        boolean result = isEven(number);
//
//        if (result) {
//            System.out.println(number + " е четно число.");
//        } else {
//            System.out.println(number + " е нечетно число.");
//        }
//    }
//}

import java.util.Scanner;

public class IsEven {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число: ");
        int userInput = scanner.nextInt();

        boolean result = isEven(userInput);

        if (result) {
            System.out.println(userInput + " е четно число.");
        } else {
            System.out.println(userInput + " е нечетно число.");
        }

        // Затваряме Scanner след използването му
        scanner.close();
    }
}