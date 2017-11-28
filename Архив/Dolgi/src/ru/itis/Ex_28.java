package ru.itis;

import java.util.Scanner;

public class Ex_28 {
    // решение 28
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        double eps = 0.0001;
        double as = in.nextDouble();
        double bs = 1.0 - as;

        double b = bs * bs * (3.0 + bs);
        double a = as * (1.0 + (bs / 2.0));

        as = a;
        bs = b;
        while (b >= eps){
            a = as * (1.0 + (bs / 2.0));
            b = bs * bs * (3.0 + bs);
            as = a;
            bs = b;
        }
        System.out.println(a);
    }
}
