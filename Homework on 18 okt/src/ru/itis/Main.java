package ru.itis;

import java.util.Scanner;

// Решение 20 д
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x0 = in.nextInt();
        int y0 = x0;
        int x1 = in.nextInt();
        int n = in.nextInt();
        int y1 = x1;
        int xsss = x1 / 2;
        int ys = x1;

        int xss = xsss + y1 + x0, xs = xss + ys + x1;
        int yss = xsss + y1, y4 = xss + ys;

        int x = xs + 0 * xss + yss + xsss;   // = x5
        int y = xs + yss;        // = y5
        int xEnd = x, yEnd = y;



        for (int k = 6; k <= n; k++) {
            y = xs + 0 * ys + yss;
            x = xs + 0 * xss + yss + xsss;
            xsss = xss;
            xss = xs;
            xs = x;
            yss = ys;
            ys = y;
        }

        System.out.println(x + xEnd);
        System.out.println(y + yEnd);

    }
}
