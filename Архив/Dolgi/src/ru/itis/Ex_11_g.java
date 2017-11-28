package ru.itis;//-
import java.util.Scanner;
public class Ex_11_g {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите n");
        int n = in.nextInt();
        double mult = 1;
        for (int k = 1; k <= n ; k++)
            mult *= Math.sin((double) k) / Math.cos((double)k);//where multiplication?
        System.out.println(mult);
    }


}
