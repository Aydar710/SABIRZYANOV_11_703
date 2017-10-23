package ru.itis;//+
// эта задача находится в папке "Задачи" в диске
import java.util.Scanner;

public class Ex_15_ {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), m = 0, numLength = 0, n1 = n, zif = 0;
        for (int i = 1; n > 0; i++) {
            n /= 10;
            numLength = i;
        }
        int[] mass = new int[numLength];


        for (int k = 0; k < mass.length; k++) {
            zif = n1 % 10;
            if (zif % 2 != 0)
                mass[k] = zif;
            n1 /= 10;
        }

        for(int i = mass.length - 1; i >= 0; i--){
            if (mass[i] != 0)
            m = m * 10 + mass[i];
        }
        System.out.println(m);
    }
}
//очень сложное решение
