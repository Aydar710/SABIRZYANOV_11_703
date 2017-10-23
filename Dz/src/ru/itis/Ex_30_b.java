package ru.itis;

import java.util.Scanner;

public class Ex_30_b {
    static double eps = 0.0001;
    static final double pi = 3.1415;
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double x = in.nextInt();
        double x0 = 0, xn = 0;
        if (((2.0 * Math.sin(pi / 2.0) - x) * (-0.5 * Math.sin(pi / 2.0))) > 0)
            x0 = pi;
        else
            x0 = 2 * pi;
        xn = x0 - (2 * Math.sin(x0 / 2) - x) / (Math.cos(x0 / 2) - 1);
        x0 = xn;
        while (Math.abs(xn - x0) >= eps) {
            xn = x0 - (2 * Math.sin(x0 / 2) - x) / (Math.cos(x0 / 2) - 1);
            x0 = xn;
        }
        System.out.println(xn);
    }
}
