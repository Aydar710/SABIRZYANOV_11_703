package ru.itis;
// Решение 32 б
public class Solution_32_b {
    public static void main(String[] args) {

        int n = 1;
        double eps = 0.0001;
        double x0 = 1;
        double x1 = 1 + (9 * Math.sin(x0) / 2);
        double xOld = x0;
        x0 = x1;


        while (Math.abs(xOld - x1) >= eps){
            x1 = 1 + (9 * Math.sin(x0) / 2);
            xOld = x0;
            x0 = x1;
            n++;
        }
        System.out.println(n);

    }
}
