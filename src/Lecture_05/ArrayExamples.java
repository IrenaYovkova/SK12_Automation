package Lecture_05;

public class ArrayExamples {
   public static void main(String[] args) {
        String [] carBrands = {"Audi", "Volvo", "Mercedes", "BMV"};
       int [] evenNumbers = {2, 4, 6, 8, 10};
        double [] degrees = {0, 0.5, 2.5, 6, 7.5};

        System.out.println(carBrands[2]);
       System.out.println(evenNumbers[4]);
        System.out.println(degrees[1]);

        System.out.println(carBrands.length);
        System.out.println(evenNumbers.length);
        System.out.println(degrees.length);
    }
}

    //заменяме стойността на елементите в стринга:
//public static void main(String[] args) {
//    String[] carBrands = {"Audi", "Volvo", "Mercedes", "BMV"};
//    carBrands[1] = "VW";
//    System.out.println(carBrands[1]);
//
//    }
//}

    // for  цикъл с арей от данни
//    public static void main(String[] args) {
//        String[] carBrands = {"Audi", "Volvo", "Mercedes", "BMV"};
//        for (int i = 0; i <= carBrands.length -1; ++i) { // i е стойност от нашия стринг, и фор цикълът се върти дикати свършат данните в стринга
//            System.out.println(carBrands[i]);
//        }
//
//    }
//}
    // това е също правилен синтаксис за фор цикъл на предния запис,tozi sintaksis dostapva vseki edin stringov elemeny
//    public static void main(String[] args) {
//        String[] carBrands = {"Audi", "Volvo", "Mercedes", "BMV"};
//        for (String elem: carBrands){
//            System.out.println(elem);
//        }
//
//    }
//}

//съзраване на многоимерен масив - таблици с три колони и три реда

//    public static void main(String[] args) {
//        int[][] arr= {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//
//        for (int row = 0; row < 3; row++) {
//            for (int column = 0; column < 3; column++) {
//                System.out.print(arr[row][column] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}
