package ru.itis;//+
// решение 30 а
public class Solution_30_a {

    public static void main(String[] args) {
        int n = 1;
        double a = 1.0 - 1.0 - 0.002, eps = 0.0001;
        double aDoubleProizvod = 20 * 1.0;
        double x0, x1;
        if ((a * aDoubleProizvod) > 0)
            x0 = 1.0;
        else
            x0 = 1.1;
        x1 = x0 - ((x0*x0*x0*x0*x0) / (5 * x0*x0*x0*x0 - 1));
        double xOld = x0;
        while (Math.abs(xOld - x1) >= eps){
            x1 = x0 - ((x0*x0*x0*x0*x0) / (5 * x0*x0*x0*x0 - 1));
            xOld = x0;
            x0 = x1;
            n++;
        }
        System.out.println(n);
    }
}
