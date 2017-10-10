package ru.itis;
import java.util.Scanner;
// Решение 12 б
public class Sol_12_b {
    static Scanner in = new Scanner(System.in);
    static int p = -1;
    static double x = in.nextDouble();
    static double eps = 0.001, t = x, sum = x;

    public static void main(String[] args) {
        for(int n = 1; t >= eps; n++){
            t *= ( x * x) / ((2*(double)n) * (2*(double)n + 1));  // неверная логика
            sum += p * t;
            p = -p;
        }
        System.out.println(sum);

    }

}
