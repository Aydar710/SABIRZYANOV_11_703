package ru.itis;
// 3) найти произвед не равных нулю элементов стоящих в массиве за максимальным эл.


public class Ex_3 {

    static int arr[] = {1, 2, 3, 4, 5, 6, 1, 3, 4}, max = arr[0], maxIndex = 0, mult = 1;

    public static void main(String[] args) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < maxIndex; i++) {
            if (arr[i] != 0)
                mult *= arr[i];
        }
        System.out.println(mult);
    }

}
