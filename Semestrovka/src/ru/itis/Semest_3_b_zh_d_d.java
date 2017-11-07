package ru.itis;

import java.util.Scanner;

public class Semest_3_b_zh_d_d {
    static Scanner in = new Scanner(System.in);
    static double a0 = in.nextDouble();
    static double b0 = in.nextDouble();
    static int n = in.nextInt();
    static double eps = in.nextDouble();
    static double aArr[] = new double[n];
    static double bArr[] = new double[n];
    static boolean f = false;
    static double c = 0;

    public static void main(String[] args) {
        aArr[0] = a0;
        bArr[0] = b0;

        for (int i = 1; i < aArr.length; i++) {
            if (a0 >= 0) {
                aArr[i] = b0 * Math.cos(a0 - b0 + 1);
            } else if (a0 < 0) {
                aArr[i] = 2.0 * Math.cos(a0 + b0);
            }

            bArr[i] = Math.log(1 + b0 * b0) / Math.log(1 + a0 * a0);
            a0 = aArr[i];
            b0 = bArr[i];
        }

        for (int i = 0; i < aArr.length; i++) {
            for (int k = 0; k < bArr.length; k++) {
                if ((aArr[i] / (1.0 + bArr[k] * bArr[k])) < eps) {
                    f = true;
                    c = aArr[i];
                }
            }
            if (f) {
                System.out.print(c + "   ,   ");
                f = false;
                c = 0;
            } else {
                c = 0;
            }
        }
    }
}
