package ru.itis;

import java.util.Scanner;

public class Ex_14_b {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите x");
        double x = in.nextDouble();
        double tk = 1.0 / a;
        double eps = 0.001;
        double sum = 0;
        while (tk >= eps){
            sum += tk * Math.log(tk * x);
            tk *= 1.0 / a;
        }
        System.out.println(sum);
    }

}
