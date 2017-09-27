package ru.itis;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
//        while (i <= b) {
//            System.out.print(i + " ");
//            i++;
//        }
        for(int i = a; i <=b; i++){
            System.out.print(i + " ");
        }
    }

}
