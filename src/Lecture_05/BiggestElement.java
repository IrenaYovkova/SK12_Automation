package Lecture_05;

public class BiggestElement {
    public static void main(String[] args) {
        int[] array = {27, 58, 99, 45, 65, 32, 1};
        int largestElement = findLargestElement(array);
        System.out.println("The largest element in the array is: " + largestElement);
    }
    private static int findLargestElement(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
//vtori variant - po kratak
//public class FindLargestElement {
//    public static void main(String[] args) {
//        int[] array = {12, 5, 27, 8, 19, 3, 14};
//
//        int largestElement = array.length > 0 ? array[0] : throw new IllegalArgumentException("Array is empty");
//
//        for (int element : array) {
//            if (element > largestElement) {
//                largestElement = element;
//            }
//        }
//
//        System.out.println("The largest element in the array is: " + largestElement);
//    }
//}