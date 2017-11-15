package OOP_With_Sidikov;

import java.util.Random;

public class Zeroize_el_lower_main_diag {
    public static void main(String[] args) {
        Homevork_Sd sd = new Homevork_Sd();
        Random r = new Random();
        int arr[][] = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = 0;
            }
        }
        sd.showMatrix(arr);
    }
}