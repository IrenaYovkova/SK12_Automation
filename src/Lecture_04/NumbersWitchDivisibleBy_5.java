package Lecture_04;
import java.util.List;

public class NumbersWitchDivisibleBy_5 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200);

        System.out.println("Numbers divisible by 5 and less than or equal to 150:");


        for (int number : list1) {
            if (number % 5 == 0 && number <= 150) {
                System.out.println(number);
            }

            if (number > 150) {
                System.out.println("Found number greater than 150. Stopping the loop.");
                break;
            }
        }
    }
}


