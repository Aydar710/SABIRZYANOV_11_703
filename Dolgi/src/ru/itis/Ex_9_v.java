package ru.itis;//-

import java.util.Scanner;

public class Ex_9_v {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите n");
        int n = in.nextInt();
        int p = -1 ;
        int m = 1;
        double sum = 1.0 / 3.0;
        while(m <= n){
            sum += p / ((2.0*m + 1) * 3.0);  //incorrect formula
            p = -p;
            m++;
        }
        System.out.println(sum);
    }
}
