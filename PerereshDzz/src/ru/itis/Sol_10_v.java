package ru.itis;
import java.util.Scanner;
// Решение 10 в
public class Sol_10_v {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        double sum = 0;
        double t = (double)x * (double) x / 2;


        for (int k = 2; k <= n; k++){
            t *= (x * x * (2 * (double)k -1)) / (2 * (double)k);
            sum += t;
        }
        if (n > 1)
            System.out.println(sum + t);
        else
            System.out.println(t);

    }

}
