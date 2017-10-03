package ru.itis;
// Решение 11 б
public class Task_11_b {
    static double sum = 0;
    static int i = 3; // произвольно
    static double multCos = 1;
    static double multSin = 1;
    static int n = 6;

    static double cosMult(double i){
        for (int n = 1; n <= i; n++){  // Плохо
            multCos = multCos * Math.cos(n);
        }
        return multCos;
    }
    static double sinMult(double i){
        for(int n = 1; n <= i; n++){ //  Плохо
            multSin = multSin * Math.sin(n);
        }
        return multSin;
    }

    public static void main(String[] args) {
        sum = (cosMult(i) / sinMult(i)) * (n + 1); // О чем речь?
        System.out.println(sum);
    }

}
