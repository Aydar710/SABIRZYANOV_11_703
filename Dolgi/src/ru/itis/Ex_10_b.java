package ru.itis;

import java.util.Scanner;

public class Ex_10_b {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Введите x");
        double x = in.nextDouble();
        double sum = x;
        System.out.println("Введите n");
        int n = in.nextInt();
        int p = -1;

        for(int k = 1; k <= n; k ++){
            sum += p * (x * x * x * x) / ((2.0 * k) * (2.0 * k - 1.0) * (4.0 * k + 1.0));
            p = -p;
        }
        System.out.println(sum);
    }
}

