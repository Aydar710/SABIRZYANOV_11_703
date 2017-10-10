package ru.itis;   // Какая задача?

public class Main {
    static final double P = 3.1415926;
    static final double E = 0.008;
    static double sum = 1;
    static int znak = -1;
    static int n = 2;

    public static void main(String[] args) {


        while (Math.abs(sum - (P / 4)) >= E) {
            sum = sum + (double)znak * (1.0 / (2 * n) - 1);
            znak *= -1;
            n++;

        }
        System.out.println(n - 1);







    }
}
