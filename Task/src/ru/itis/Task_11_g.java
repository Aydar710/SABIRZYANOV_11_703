package ru.itis;
// Решение 11 г
public class Task_11_g {
    static double multiplication = 1;
    static int n = 4;
    static double multCos = 1;
    static double multSin = 1;

    static double cosMult(double i){
        for (int n = 1; n <= i; n++){
            multCos = multCos * Math.cos(n);
        }
        return multCos;
    }
    static double sinMult(double i){
        for(int n = 1; n <= i; n++){
            multSin = multSin * Math.sin(n);
        }
        return multSin;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= n; i++){
            multiplication = multiplication * (sinMult(i) / cosMult(i));
        }
        System.out.println(multiplication);
    }


}
