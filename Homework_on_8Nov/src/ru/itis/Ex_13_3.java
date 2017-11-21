package ru.itis;//- what task?

public class Ex_13_3 {

static int x[] = {1, 2, 2, 2, 4, 4, 5, 5};
static int v[] = new int[x.length];
static int lenght = 1;
static int n = 0;
static boolean f = true;
    public static void main(String[] args) {
            for (int i = 0; i < x.length; i+=0){
                for (int k = i; f && k < x.length -1; k++){
                    if (x[k] == x[k + 1]) {
                        lenght++;
                        i = k;
                    }
                    else{
                        i ++;
                        f = false;
                    }
                }
                System.out.println(lenght);
                lenght = 1;
                f = true;
                if (i == 0)
                    i++;
            }
    }
}
