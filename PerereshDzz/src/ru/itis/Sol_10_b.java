package ru.itis;
import java.util.Scanner;
// решение 10 Б стр 22

public class Sol_10_b {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        double sum = 0;
        int p = 1;
        int x = in.nextInt();
        int n = in.nextInt();
        double t = x - 0.1;

        for(int k = 2; k <= n; k++){
            t *= (x * x * x * x) / ((2 * (double)k -1) * (2 * (double)k) * (4 * (double)k + 1));
            sum = sum + (t * p);
            p = -p;
        }
        if (n > 2)
            System.out.println(sum + x);
        else
            System.out.println(t);
    }
}
