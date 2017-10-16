package ru.itis;
// 29 a

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static int n = 1;
    static double eps = 0.0001;


    public static void main(String[] args) {
        double x0 = 0, x1;
        x1 = (x0 + 1) / (x0 + 2);
        while (Math.abs(x0 - x1) > eps) {
            x0 = x1;
            x1 = (x0 + 1) / (x0 + 2);
            n++;
        }
        System.out.println(n);

    }
}
