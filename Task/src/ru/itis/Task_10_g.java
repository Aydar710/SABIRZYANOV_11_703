package ru.itis;
// Решение 10 г
public class Task_10_g {
    static double s = 0;
    static int x = 5;
    static int n = 3;
    static int k = 0;
    static int fact_chet = 2;
    static int fact_nechet = 1;



    public static void main(String[] args) {
        for (k = 2; k <= 2 * n; k++ ){
            if (k % 2 == 0) {
                s = s + Math.pow(x, k) / fact_chet;
                fact_chet = fact_chet * (fact_chet + 2); //странная формула
            }else{
                fact_nechet = fact_nechet * (fact_nechet + 2);//странная формула
                s = s + Math.pow(x, k ) / fact_nechet;
        }
            //Остальные замечания см предыдущую задачу
        }
        System.out.println(s + x);
    }
}
