package ru.itis;
import java.util.Scanner;
// Решение 12 г
public class Sol_12_g {
    static Scanner in = new Scanner(System.in);
    static int p = 1;
    static double x = in.nextDouble();
    static double eps = 0.00001, t = 1, sum = 0;

    public static void main(String[] args) {
        for(int n = 1; t >= eps; n++){
            sum += p * t;
            t *= (x * x) / (2 * (double)n * (2 * (double)(n - 1)));
            p = -p;
        }
        System.out.println(sum);

    }

}
