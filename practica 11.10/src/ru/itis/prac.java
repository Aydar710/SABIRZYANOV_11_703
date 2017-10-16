package ru.itis;

import java.util.Scanner;

// 25
public class prac {
    static Scanner in = new Scanner(System.in);
    static double eps = 0.0001;
    static double y0;

    public static void main(String[] args) {
        double x = in.nextDouble();
        if (x >= 1)
            y0 = x / 3;
        else
            y0 = x;

        double y1 = y0 - (1.0 / 3 * (y0 - (x / y0 * y0)));
        while (Math.abs(y0 - y1) > eps) {
            y0 = y1;
            y1 = y0 - (1.0 / 3 * (y0 - (x / y0 * y0)));
        }
        System.out.println(y1);


    }
}
