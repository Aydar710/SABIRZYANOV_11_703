package ru.itis;//я не задавала этих задач!

import java.util.Scanner;

public class Ex_24_a {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        for (int n = 1; n <= 30; n++) {
            int m = 2 * n + 1;
            int fibon[] = new int[m + 1];
            fibon[0] = 0;
            fibon[1] = 1;

            for (int i = 2; i < fibon.length; i++) {
                fibon[i] = fibon[i - 1] + fibon[i - 2];
            }
            int Fm = 0;
            for (int i = 2; i < fibon.length; i += 2) {
                Fm += fibon[i];
            }
            Fm += 1;
            if (Fm == fibon[fibon.length - 1])
                System.out.println("Для n = " + n + " - верно");
            else
                System.out.println("Для n = " + n + " - не верно");
        }
    }
}
