package ru.itis;//-

import java.util.Scanner;

public class Main {
// решение 10а) на стр 22

    static Scanner in = new Scanner(System.in);

    static int p = -1;
    static double sum = 0;

    public static void main(String[] args) {
        int x = in.nextInt();
        int n = in.nextInt();
        double t = x;

         for (int k = 1; k <= n; k++){
             sum += t;
             t *= (double)p * (((double)x * (double)x) / ((double)k * (2 * (double)k + 1)));//зачем-то навтыкали кучу "даблов"
                                                                                //а формула неверная
             p = -p;
         }
        System.out.println(sum + t);



    }
}
