package ru.itis;

public class Ex_037 {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4, 5, 5, 4},
                {6, 7, 8, 5, 7, 8, 3},
                {2, 3, 4, 6, 5, 6, 4},
                {6, 7, 8, 7, 3, 2, 2},
                {5, 6, 9, 1, 4, 8, 7},
                {1, 2, 3, 4, 5, 6, 1},
                {1, 2, 3, 4, 5, 6, 1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------");

        for (int i = 0; i <= matrix.length / 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j > i && j < matrix.length - i - 1) {
                    matrix[i][j] = 0;
                    matrix[matrix.length - i - 1][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
