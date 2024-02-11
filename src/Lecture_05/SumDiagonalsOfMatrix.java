package Lecture_05;

public class SumDiagonalsOfMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int diagonalSum = findDiagonalSum(matrix);

        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
    private static int findDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Add only when the row index is equal to the column index
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
