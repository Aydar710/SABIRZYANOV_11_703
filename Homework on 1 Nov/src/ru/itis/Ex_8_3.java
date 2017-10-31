package ru.itis;

import java.util.Random;

public class Ex_8_3 {
    static Random random = new Random();
    static int s[] = new int[10];
    static int t1[] = new int[10];
    static int t2[] = new int[10];
    static int b1[] = new int[10];
    static int b2[] = new int[10];
    static int vekt[] = new int[10];
    static int vekt2[] = new int[10];
    static int vekt3[] = new int[10];


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

        for (int i = 0; i < b1.length; i++) {  // объединение
            if (b1[i] != 0 || b2[i] != 0)
                vekt[i] = 1;
        }

        for (int i = 0; i < b1.length; i++) {  // пересечение
            if (b1[i] != 0 && b2[i] != 0)
                vekt2[i] = 1;
        }
        for (int i = 0; i < b1.length; i++) {  // разность
            if (b1[i] != 0 && b2[i] == 0)
                vekt3[i] = 1;
            else
                vekt3[i] = 0;
        }

    }
}
