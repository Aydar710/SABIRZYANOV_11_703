package ru.itis;

public class Ex_15_2 {
    static int x[] = {1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 3, 1, 2, 3, 4, 5, 6, 7};
    static int u[] = new int[x.length], c = 0;
    static int length = 1;

    public static void main(String[] args) {
        for (int i = 0; i < x.length; i += 0) {
            if (i != x.length - 1 && x[i] <= x[i + 1]) {
                for (int k = i; k != x.length - 1 && x[k] <= x[k + 1]; k++) {
                    if (x[k] <= x[k+1])
                        length++;
                    else
                        length += 2;
                    i = k + 2;
                }
            } else
                i++;
            c++;
            u[length]++;
            length = 1;
        }
        for (int x : u)
            System.out.print(x + " ");
    }
}
