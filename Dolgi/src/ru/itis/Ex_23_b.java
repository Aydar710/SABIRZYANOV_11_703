package ru.itis;

import java.util.Scanner;

public class Ex_23_b {
    static Scanner in = new Scanner(System.in);
// по условию a <= vk <= b , следовательно нужно вводить более большое b, чтобы найти значения vk

    public static void main(String[] args) {
        System.out.println("x = ");
        double x = in.nextDouble();
        System.out.println("a= ");
        int a = in.nextInt();
        System.out.println("b= ");
        int b = in.nextInt();
        int vs = a, vss = a;
        int v = vs + vss;
        vss = vs;
        vs = v;
        int p = -1;
        double sum = 0;
        if ((v >= a) && (v <= b)) {
            sum = (v / 4.0) * Math.cos(v * x) * Math.cos(v * x);
            double m = v / 4.0;
            vss = vs;       //
            vs = v;         //
            v = vs + vss;   //  перекидка для n = 3
            m *= v / 2.0;
            while ((v >= a) && (v <= b)) {
                sum += p * (m * Math.cos((double) v * x) * Math.cos((double) v * x));
                vss = vs;
                vs = v;
                v = vs + vss;
                m *= v / 2.0;
                p = -p;
            }

        }
        System.out.println(sum);
    }
}