package ru.itis;

public class Ex_22_5 {

    static int a[] = {1, 5, 5, 2, 3, 3, 7, 8, 8, 84, 52};
    static int c = 0;
    static boolean f = true;

    public static void main(String[] args) {
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; f && k < a.length; k++) {
                if (i != k && a[i] == a[k])
                    f = false;
            }
            if (f) {
                c++;
            } else
                f = true;

        }
        System.out.println(c);
    }

}
