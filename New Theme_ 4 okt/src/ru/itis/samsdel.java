package ru.itis;

public class samsdel {

    static double sum = 2, eps = 0.001, t = 2;
    static int x = 2, n = 1;


    public static void main(String[] args) {
        while(Math.abs(t) > eps ){
            sum = sum + t;
            t = t * x / (n + 1);
            n++;
        }
        System.out.println(sum + 3);
    }
}
