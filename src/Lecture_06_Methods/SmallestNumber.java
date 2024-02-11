package Lecture_06_Methods;
public class SmallestNumber {
    public static void printSmallerNumber(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        printSmallerNumber(11, 8, 6);
    }

}



