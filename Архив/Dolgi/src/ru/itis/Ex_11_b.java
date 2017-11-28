package ru.itis;
import java.util.Scanner;

public class Ex_11_b {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите n");
        int n = in.nextInt();
        double sum = 0;
        for (int k = 1; k <= n + 1 ; k++) // не получается взять k равным нулю
            sum += Math.cos((double) k) / Math.sin((double)k);
        System.out.println(sum);
    }

}
