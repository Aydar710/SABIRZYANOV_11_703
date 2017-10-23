package ru.itis;

import java.util.Scanner;
// Решение 14 б
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = {1, 4, 4, 6, 6, 6, 9, 9, 5, 8, 34, 34};
        int m = 0;
        int n = 0;
        int b[] = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]){
                b[m] = a[i];
                m++;
            }
        }
        for (int i = 1; i < b.length; i++){
            n = i;
            for (int k = n + 1; k < b.length; k ++){
                if (b[k] == b[n])
                    b[k] = 0;
            }
        }
        for(int i = 1; i < b.length; i++){   //  убрал нули между ненулевыми элементами
            if (b[i - 1] == 0) {
                b[i - 1] = b[i];
                b[i] = 0;
            }
        }

        for (int x:b)
            System.out.print(x + " ");
    }
}