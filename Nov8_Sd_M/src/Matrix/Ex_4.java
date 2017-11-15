package Matrix;

import java.util.Random;

public class Ex_4 {
    public static void main(String[] args) {
        Homevork_Sd sd = new Homevork_Sd();
        Random r = new Random();
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
        sd.showMatrix(arr);
        System.out.println("---------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;

            }
        }
        sd.showMatrix(arr);


    }
}
