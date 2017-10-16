package ru.itis;
import java.util.Scanner;
// Решение 12 a
public class Sol_12_a {
    static Scanner in = new Scanner(System.in);
    static int x = in.nextInt();
    static double eps = 0.001;
    public static void main(String[] args) {
        double t = x;
        double sum = x;
        for (int n = 2; t >= eps; n++){
            t *= (double)x / (double)n;      // неверная логика
            sum += t;
        }
        System.out.println(sum + 1);


    }
}
