package ru.itis;

import java.util.Random;

public class Ex_8_2 {
    static Random random = new Random();
    static int s[] = new int[10];
    static int t1[] = new int[10];
    static int t2[] = new int[10];
    static int b1[] = new int[10];
    static int b2[] = new int[10];
    static int n = 0;


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            s[i] = random.nextInt(3);
            t1[i] = random.nextInt(3);
            t2[i] = random.nextInt(3);
        }


        for (int i = 0; i < t1.length; i++) {
            if (s[i] == t1[i])
                b1[i] = 1;
            else
                b1[i] = 0;
        }
        for (int i = 0; i < t1.length; i++) {
            if (s[i] == t2[i])
                b2[i] = 1;
            else
                b2[i] = 0;
        }
        for (int i = 0; i < b2.length; i++){
            if (b1[i] != b2[i])
                n++;
        }
     if (n == 0)
         System.out.println("является подмножеством (включается)");
        else
         System.out.println("не является подмножеством (не включается)");






    }
}
