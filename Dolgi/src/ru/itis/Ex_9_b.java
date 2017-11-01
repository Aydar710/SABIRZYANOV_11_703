package ru.itis;
import java.util.Scanner;
public class Ex_9_b {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
         double sum = 0.5;
         int m = 2;
        System.out.println("Введите n");
         int n = in.nextInt();
         while(m <= n){
             sum += ((m-1) * (m-1)) / ((2.0 * m) * (2.0 * m - 1));
             m++;
         }
        System.out.println(sum);


    }
}
