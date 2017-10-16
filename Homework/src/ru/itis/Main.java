package ru.itis;
import java.util.Scanner;
// реш 7
public class Main {


    public static void main(String[] args) {
        final double  P = 3.1415926;
        double eps = 0.00008;
        double r = 4.0/3;
        int c = 2;
        for (int k = 2; Math.abs(r - (P / 2)) >= eps; k++){
            r *= ((2.0*k) / (2.0*k - 1.0)) * ( (2.0*k) / (2.0*k + 1.0) );// одни нули же! Почему присылаете неработающую программу?
            c++;
        }
        System.out.println(c);


    }
}


