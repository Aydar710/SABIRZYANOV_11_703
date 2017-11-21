package ru.itis;//-

import java.util.Scanner;

public class Ex_10_a {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите x");
        int x = in.nextInt();
        System.out.println("Введите n");
        int n = in.nextInt();
        int k = 1;
        int p = -1;
        double sum = x;
        while (k <= n){
            sum += (double)p * ((x * x) / ((double)k * (2 * k + 1)));  //incorrect formula
            k++;
            p = -p;
        }
        System.out.println(sum);

    }

}
