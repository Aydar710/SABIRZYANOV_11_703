package ru.itis;

public class Dz {
    static final double P = 3.1415926;
    static final double E = 0.232;
    static double mult = 1;
    static int k = 1;
    static int n = 4;
    static double l = 0;

    public static void main(String[] args) {

        for(double i = 1; i <= 5; i++){
            mult =  mult * ((4 * i*i) / (4 * i*i - 1));
            if (Math.abs(mult - P / 2) <= E){
                l = i;
                break;
            }
        }
        System.out.println(l);



    }
}
