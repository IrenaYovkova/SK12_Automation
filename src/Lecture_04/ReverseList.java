package Lecture_04;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(10, 20, 30, 40, 50);

        System.out.println("Original List: " + list1);

        List<Integer> reversedList = reverseList(list1);

        System.out.println("Reversed List: " + reversedList);
    }

    private static List<Integer> reverseList(List<Integer> originalList) {
        List<Integer> reversedList = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }
}

