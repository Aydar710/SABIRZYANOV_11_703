package ru.itis;
import java.util.Scanner;
// Решение 12 г
public class Sol_12_g {
    static Scanner in = new Scanner(System.in);
    static int p = 1;
    static double x = in.nextDouble();
    static double eps = 0.0000001, t =  (x * x) / 2, sum = 1 - ((x * x) / 2);

    public static void main(String[] args) {
        for(int n = 2; t >= eps; n++){
            t *= (x * x) / (2 * (double)n); // неверно считается факториал
            sum += p * t;            // неверная логика
            p = -p;
        }
        System.out.println(sum);

    }

}
