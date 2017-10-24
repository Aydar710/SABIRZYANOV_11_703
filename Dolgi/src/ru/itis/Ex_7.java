package ru.itis;

import java.util.Scanner;

public class Ex_7 {

    static Scanner in = new Scanner(System.in);
    static double eps = 0.0001;
    static double pi = 3.1415926;

    public static void main(String[] args) {

        double r = 4.0 / 3;
        for (int k = 2; Math.abs(r - pi / 2.0) >= eps; k++){
            r *= 4.0 * k * k / (4.0 * k * k - 1.0);
        }
        System.out.println(r);
    }
}
