package ru.itis;
import java.util.Scanner;
// Решение 12 б

public class Sol_12_b {
    static Scanner in = new Scanner(System.in);
    static int p = 1; // ,было -1
    static double x = in.nextDouble();
    static double eps = 0.001, t = x, sum = x;

    public static void main(String[] args) {
        for(int n = 1; t >= eps; n++){
            sum += p * t; // поменял местами 2 строки. Проверить использовать изменть!!!
            t *= ( x * x) / ((2*n) * (2*n + 1));
            p = -p;
        }
        System.out.println(sum);

    }

}
