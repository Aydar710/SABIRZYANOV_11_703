package ru.itis;
import java.util.Scanner;
public class Main2 {


    public static void main(String[] args) {
        final double  P = 3.1415926;
        double eps = 0.00008;
        double r = 4/3;
        int c = 2;
        for (int k = 2; Math.abs(r - (P / 2)) >= eps; k++){
            r *= ((2*k) / (2*k - 1)) * ((2*k) / (2*k + 1) );// одни нули же! Почему присылаете неработающую программу?
            c++;
        }
        System.out.println(c);


    }
}


//for (int k = 1; count >= eps; k++){
 //       r *= (4 * (double)k * (double)k) / (4 * (double)k * (double)k - 1);
   //     c++;
     //   }
