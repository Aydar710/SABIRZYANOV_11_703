package ru.itis;

public class Ex_15_1 {

    static int x[] = {1, 2, 3, 8, 4, 5, 3, 5, 6, 7, 7};
    static int s = x.length, t = 0, c = 1;


    public static void main(String[] args) {

        for (int i = 0; i < x.length; i += 0) {
            if (i != x.length - 1) {
                if (x[i] <= x[i + 1]) {
                    for (int k = i; k != x.length - 1 && x[k] <= x[k + 1] ; k++) {
                        c++;
                        i = k + 2;
                    }
                } else if (x[i] >= x[i + 1])
                    i++;

            }else {
                c = 1;
                i++;
            }
            if (c > t)
                t = c;

            if (c < s)
                s = c;
            c = 1;
        }
        System.out.println(s + "  " + t);
    }
}
