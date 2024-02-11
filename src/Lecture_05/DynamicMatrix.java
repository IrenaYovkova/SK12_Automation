package Lecture_05;


import java.util.Scanner;

public class DynamicMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на броя на редовете и колоните
        System.out.print("Въведете брой редове: ");
        int rows = scanner.nextInt();
        System.out.print("Въведете брой колони: ");
        int columns = scanner.nextInt();

        // Създаване на двумерен масив със зададените размери
        int[][] matrix = new int[rows][columns];

        // Въвеждане на елементите на матрицата
        System.out.println("Въведете елементите на матрицата:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Извеждане на матрицата
        System.out.println("Елементите на матрицата са:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Нов ред след всеки ред
        }

        scanner.close();
    }
}