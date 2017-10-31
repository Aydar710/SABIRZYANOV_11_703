package ru.itis;

import java.util.Random;

public class Ex_8_1 {
    static Random random = new Random();
    static int s[] = new int[10];
    static int t1[] = new int[10];
    static int t2[] = new int[10];
    static int b1[] = new int[10];
    static int n = 0;


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            s[i] = random.nextInt(3);
            t1[i] = random.nextInt(3);
            t2[i] = random.nextInt(3);
        }


        for (int x : s) {
            System.out.print(x + " ");

        }
        System.out.println();
        for (int x : t1) {
            System.out.print(x + " ");

        }


        for (int i = 0; i < t1.length; i++) {
            if (s[i] == t1[i])
                b1[i] = 1;
            else
                b1[i] = 0;
        }
        System.out.println();
        for (int x: b1)
            System.out.print(x + " ");

        for (int i = 0; i < t1.length; i++){
            if (b1[i] != 0)
                n++;

        }
        System.out.println();
        System.out.println("n = " + n);
    }


}
