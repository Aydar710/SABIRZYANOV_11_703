package ru.itis;

import java.util.Scanner;

public class Ex_9_a {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m = 2;
int p = -1;
        System.out.println("Введите n");
        int n = in.nextInt();
        double sum = 1;

        while(m <= n){
            sum = sum + ((double)p / (m * m));
            p = -p;
            m++;
        }
        System.out.println(sum);




    }


}
