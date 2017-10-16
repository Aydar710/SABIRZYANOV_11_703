package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double eps = 0.0001;
        double x = in.nextDouble();
        double ast = 1, anov, bnov;
        double bst = 1 - x;
       // для к = 1
        anov = ast * (1 + bst);
        bnov = bst * bst;
        while(bnov >= eps){
            ast = anov;
            bst = bnov;
            anov = ast * (1 + bst);
            bnov = bst * bst;
        }
        System.out.println(anov);
    }
}
