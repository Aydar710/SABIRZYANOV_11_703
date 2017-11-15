package OOP_With_Sidikov;
//  Первая задачка Сидикова
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Homevork_Sd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int arr[][] = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(100);
            }
        }


        for(int i = 0; i < arr.length; i++)
            sortBubble(arr[i]);
        showMatrix(arr);

    }

    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortBubble(int matrix[]) {
        boolean f = true;
        for (int i = 0; i < matrix.length - 1 && f; i++) {
            f = false;
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j] > matrix[j + 1]){
                    int t = matrix[j + 1];
                    matrix[j + 1] = matrix[j];
                    matrix[j] = t;
                    f = true;
                }
            }
        }
    }
}
