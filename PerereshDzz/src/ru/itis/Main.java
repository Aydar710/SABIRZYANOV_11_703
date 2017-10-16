package ru.itis;
import java.util.Scanner;
public class Main {
// решение 10а) на стр 22

static Scanner in = new Scanner(System.in);

static int p = -1;
static double sum = 0;

    public static void main(String[] args) {
        System.out.println("Нажмите ENTER и введите x");
         int x = in.nextInt();
        System.out.println("Нажмите ENTER и введите n");
         int n = in.nextInt();
         double t = x;

        for (int k = 1; k <= n; k++){
            t = (t * (x * x)) / (k * (2 * k + 1));  //в знаменателе накапливаете лишний факториал
            sum +=  p *t;
            p = -p;
        }
        System.out.println(sum + x);

    }
}
