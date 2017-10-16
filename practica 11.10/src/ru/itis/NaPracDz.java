package ru.itis;

import java.util.Scanner;

// 29 б
public class NaPracDz {
    static Scanner in = new Scanner(System.in);
    static double x0 = 0, x1;
    static double eps = 0.0001;
    static int n = 0;

    public static void main(String[] args) {
        x1 = Math.cos(x0);
        while (Math.abs(x0 - x1) >= eps){
            x0 = x1;
            x1 = Math.cos(x0);
            n++;
        }
        System.out.println(n);
    }

}
