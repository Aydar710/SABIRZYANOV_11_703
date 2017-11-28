package Matrix;

import java.util.Random;

public class Magic_Square {
    public static void main(String[] args) {
        boolean f = true;
        Homevork_Sd sd = new Homevork_Sd();
        Random r = new Random();
        int arr[][] = {{2, 7, 6,},
                {9, 5, 1},
                {4, 3, 8}};
 /*       for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(5);
            }
        } */
        sd.showMatrix(arr);
        int sum = 0;
        int t = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[0][i];
        System.out.println("-----");
        System.out.println(sum);
        for (int i = 0; i < arr.length && f; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                t += arr[i][j];
            }
            if (sum != t)
                f = false;
            t = 0;
            for (int j = 0; j < arr[i].length && f; j++)
                t += arr[j][i];
            if (sum != t)
                f = false;
            t = 0;
        }
        for (int i = 0; i < arr.length && f; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    t += arr[i][j];
            }
        }
        if (sum != t)
            f = false;
        t = 0;
        for (int i = arr.length - 1; i >= 0 && f; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i)
                    t += arr[i][j];
            }
        }
        if (sum != t)
            f = false;

        if (f)
            System.out.println("Square is magic");
        else
            System.out.println("Square is not magic");
    }
}