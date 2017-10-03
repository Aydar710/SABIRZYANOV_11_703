package ru.itis;
// Решение 10 а
public class Main {
    static double s = 0;
    static double znak = -1;
    static int x = 2;  // Взял произвольно
    static int n = 2;
    static int k = 1;
    public static void main(String[] args) {

        for (int i = 1; i <= n; i ++){
            k = k * i;  //Это не считаем отдельно, будет быстро расти
            s = s +  ((znak * Math.pow(x, 2*k + 1)) / (k * (2*k + 1)));// Степень наращиваем от шага к шагу, а не считаем заново
               // предполагалось, что вы найдете формулу подсчета всего слагаемого, а не по частям
            znak *= -1;
        }
        s += x;   // Отсчет факториала начал с единицы, а не с нуля
        System.out.println(s);
    }
}
