package ru.itis;

// Решение 29 б
public class Solution_29_b {

    public static void main(String[] args) {
        int n = 1;
        double xs = 0;
        double eps = 0.0001;
        double x = Math.cos(xs);
        double xOld = xs;
        xs = x;
        while (Math.abs(x - xOld) >= eps) {
            x = Math.cos(xs);
            xOld = xs;
            xs = x;
            n++;
        }
        System.out.println(n);
    }
}
