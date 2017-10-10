package ru.itis;
// Решение 10 б
public class Task_10_b {
    static double s = 0;  // Нет значения при к = 0
    static int znak = 1;
    static int x = 1;  // Взял произвольно // Лучше вводить
    static int n = 1;  //Лучше вводить
    static int k = 0;
    static double sum_for_k_raven_1 = (-1 * Math.pow(x, 5)) / 10;
    static int fact = 0;

    public static void main(String[] args) {
        fact = 2;
        for (int i = 2; i <= n; i++){
            k = i + 2;
            fact = fact  * (k - 1) * k; //Неверная формула
            s = s +  ((znak * Math.pow(x, 4*i + 1) / (fact * (4*i + 1) ))); //Нужна общая формула
        }
        s = s + x + sum_for_k_raven_1;
        System.out.println(s);
    }
}
