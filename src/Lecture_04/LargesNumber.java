package Lecture_04;

public class LargesNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 200, 15}; // Example array, you can replace it with your own array

        // Assume the first element is the largest
        int largestNumber = numbers[0];

        // Iterate through the array to find the largest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largestNumber);
    }
}


