package ru.itis;
// Решение 10 в
public class Task_10_v {
    static double s = 0;
    static int n = 3;
    static int k = 1;
    static int x = 3;
    static int fact_nechet = 1;
    static int fact_chet = 1;

    public static void main(String[] args) {
        for(k = 1; k <= n; k++){
            fact_nechet = fact_nechet * ((2 * k - 1));
            fact_chet = fact_chet * 2 * k;
            s = (s + (Math.pow(x, 2*k)* fact_nechet)) / fact_chet;
        }
        System.out.println(s);
    }

}
