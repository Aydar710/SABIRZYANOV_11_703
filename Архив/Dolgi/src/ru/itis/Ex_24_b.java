package ru.itis;

import java.util.Scanner;

public class Ex_24_b {
    static Scanner in = new Scanner(System.in);
    static double eps = 0.001;

    public static void main(String[] args) {
        System.out.println("x = ");
        double x = in.nextDouble();
        double bs = Math.cos(x), b1 = Math.cos(x);
        double cs = Math.sin(x), c1 = Math.sin(x);
        double b = bs * b1 - cs * c1, c = cs * b1 + c1 * bs;
        double t = Math.cos(x);
        double sum = 0;
        int p = 1;
        bs = b;
        cs = c;
        b = bs * b1 - cs * c1;    //  для n = 2
        c = cs * b1 + c1 * bs;    //
        bs = b; // n = 3
        cs = c; // n = 3
        int n = 2;
        while (Math.abs(t) >= eps){
            sum += p * t;
            b = bs * b1 - cs * c1;
            c = cs * b1 + c1 * bs;
            t = b / (double)n;
            bs = b;
            cs = c;
            b = bs * b1 - cs * c1;
            c = cs * b1 + c1 * bs;
            bs = b;
            cs = c;
            p = -p;
            n++;
        }
        System.out.println(sum);
    }

}
