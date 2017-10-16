package ru.itis;
import java.util.Scanner;
// Решение 12 в

public class Sol_12_v {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Нажмите ENTER и введите x,  |x| < 1");
            double x = in.nextDouble();
            double t = x;
            double sum = 0, eps = 0.00001;
            int p = 1;


            for (int n = 2; t >= eps; n++) {
                sum += t * p;
                t *= x / ((double) n / ((double) n - 1));
                p = -p;
            }
            System.out.println(sum);
        }
    }
