package Lecture_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

//DOBAVYAME I PREMANVAME ELEMENTI
public class ArrayListExam_02 {
   public static void main(String[] args) {
       ArrayList<String> cars = new ArrayList<>();
       cars.add("Trabant");
       cars.add("Volvo");
       cars.add("Mercedes");//index=2
       cars.add("BMW");
       cars.remove(2); // mahame go ot spisyka
       // System.out.println(cars.get(0));
       System.out.println(cars);
       System.out.println("get index 2 " + cars.get(2));

       for (String i : cars) {
           System.out.println(i);
       }
       Collections.sort (cars);
   }
}
 // когато използваме object може да слагаме ралични типове данни - яисла и текст
//public static void main(String[] args) {
//    ArrayList<Object> mixedList = new ArrayList<>();
//    mixedList.add ("Hello world!");
//    mixedList.add (42);
//    mixedList.add (3.14);
//
//    for (Object element: mixedList){
//        System.out.println(mixedList);
//    }
//
//
//    }
//}