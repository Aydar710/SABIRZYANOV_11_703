package ru.itis;

import java.util.Scanner;

// Решение 2ггг
public class Main {
    static Scanner in = new Scanner(System.in);
    static double z0 = in.nextDouble(), z1 = in.nextDouble(), h = in.nextDouble();
    static int n = in.nextInt(), m = in.nextByte();
    static double[] zArr = new double[n];
    static int fi[] = new int[m];
    static double z_Arr[] = new double[n];

    public static void main(String[] args) {
        zArr[0] = z0;
        zArr[1] = z1;
        for (int i = 2; i < zArr.length; i++) {
            if (z1 >= 0) {
                zArr[i] = z0 * Math.cos(z1 - z0 + 1);
                z0 = z1;
                z1 = zArr[i];
            } else {
                zArr[i] = 2 * Math.cos(z0 + z1);
                z0 = z1;
                z1 = zArr[i];
            }
        }

        for (int i = 0; i < z_Arr.length; i++)
            z_Arr[i] = Math.abs(zArr[i] - 2.5);

        for (int i = 0; i < fi.length; i++) {
            for (int k = 0; k < z_Arr.length; k++) {
                if (z_Arr[k] >= i && z_Arr[i] < (i + 1) * h){
                      fi[i] += 1;                                                      // индексы в задаче не соответствуют.
                }
                                                                            // так как первый интервал [ 0, j * h ), я тоже первый интервал взял таким же
            }
        }
        for (int x: fi)
            System.out.print(x + " ");

    }


}
