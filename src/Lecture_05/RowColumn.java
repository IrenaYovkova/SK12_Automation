package Lecture_05;

//Print elements of a given 2-d matrix with 4 rows and 3 columns
public class RowColumn {
   public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,},
                {4,5,6,},
                {7,8,9},
                {10,11,12},
        };
        for (int row = 0; row <4; row++){
            for (int column = 0; column < 3; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
   }
}
