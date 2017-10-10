package ru.itis;
// 6 б стр 21
public class Main {
    static int n = 0, p = 1;
    static double t = 1, eps = 0.0001, s = 0;


    public static void main(String[] args) {
        while (Math.abs(t) > eps){
            s += p*t;
            n++;
            t = 1.0 / ((2 * n + 1) * (2 * n + 1));
            p = -p;
        }
        System.out.println(s);

    }
}
