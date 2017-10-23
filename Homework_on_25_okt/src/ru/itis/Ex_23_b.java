package ru.itis;//что за задача?
// 23 б
public class Ex_23_b {
    static double x[] = {1.54, 2.25, 3.14, 4.3, 5, 5.5};
    static double s[] = new double[x.length];
    static double a = x[0];
    static double b = x[x.length - 1];
    static double h = (b - a) / (s.length - 1);
    static int n = 0;


    public static void main(String[] args) {
        for (int k = 0; k < s.length; k++) {
            n = 0;
            for (int i = 0; i < x.length; i++) {
                if ((x[i] >= a + ((double)i - 1) * h) && (x[i] < a + (double) i * h))
                    n++;
                s[k] = n;
            }
        }
        for (double x : s)
            System.out.print(x + " ");
    }
}
