package ru.itis;//+
// эта задача находится в папке "Задачи" в диске
import java.util.Scanner;

public class Ex_14_ {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int c = 0;
        for(int i = 1; n > 0; i++){
            n /= 10;
            c = i;
        }
        System.out.println(c);
    }
}
