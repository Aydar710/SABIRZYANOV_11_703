package ru.itis;
import java.util.Scanner;
// Рeшение 10 г
public class Sol_10_g {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double sum = 0;
        int x = in.nextInt();
        int n = in.nextInt();
        double t1 = x;
        double t2 = (x * x) / 2;

        for (int k = 1; k <= 2 * n; k+=2){
        sum += t1;
        t1 *= (x * x) / (double)k;
        }
        for (int k = 2; k <= 2 * n; k+=2){
            sum += t2;
            t2 *= (x * x) / (double)k;
        }
        System.out.println(sum);

    }
}
