package Lecture_05;


import java.util.LinkedList;


public class ReverseElement {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("Original LinkedList: " + linkedList);

        // Reverse the order of elements
        reverseLinkedList(linkedList);

        System.out.println("Reversed LinkedList: " + linkedList);

        // Iterating through the reversed LinkedList
        System.out.println("Iterating through the reversed LinkedList:");
        for (Integer i : linkedList) {
            System.out.println(i);
        }
    }

    // Method to reverse a LinkedList
    private static void reverseLinkedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}
//import java.util.LinkedList;
//
//public class ReverseElement {
//    public static void main(String[] args) {
//        // Създаване на свързан списък (LinkedList)
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        // Добавяне на елементи към списъка
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3); // Индекс 2
//        linkedList.add(4);
//
//        // Печат на оригиналния списък
//        System.out.println("Оригинален списък: " + linkedList);
//
//        // Обръщане на реда на елементите
//        reverseLinkedList(linkedList);
//
//        // Печат на обърнатия списък
//        System.out.println("Обърнат списък: " + linkedList);
//
//        // Достъп до елемент по индекс
//        System.out.println("Елемент на индекс 2: " + linkedList.get(2));
//
//        // Итериране през обратно наредения списък
//        System.out.println("Итериране през обратно наредения списък:");
//        for (Integer i : linkedList) {
//            System.out.println(i);
//        }
//    }
//
//    // Метод за обръщане на свързан списък
//    private static void reverseLinkedList(LinkedList<Integer> list) {
//        int size = list.size();
//        for (int i = 0; i < size / 2; i++) {
//            // Swap на елементите от началото и края на списъка
//            int temp = list.get(i);
//            list.set(i, list.get(size - i - 1));
//            list.set(size - i - 1, temp);
//        }
//    }
//}