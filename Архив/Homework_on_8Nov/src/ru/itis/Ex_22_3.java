package ru.itis;

public class Ex_22_3 {

    static int a[] = {5, 4, 3, 2, 1};
    static boolean f = true;
    static int c = 0;

    public static void main(String[] args) {
        for (int i = 0; i < a.length - 1 && f; i++) {
            if (a[i] > a[i + 1]) {
                f = false;
                c++;
            }
        }
        if (f)
            System.out.println("По возрастанию");
        f = true;
        for (int i = 0; i < a.length - 1 && f; i++) {
            if (a[i] < a[i + 1]){
                f = false;
                c++;
        }}
        if (f)
            System.out.println("По убыванию");
        if (c == 2)
            System.out.println("Не упорядочен");
    }

}
