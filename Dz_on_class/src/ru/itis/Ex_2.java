package ru.itis;
/* 2) Дан массив, состоящий из различных чисел, найти сумму эл, расположенных между его минимальным и максимальным элементом.
Сами элементы макс и мин не включаются в сумму */
public class Ex_2 {

    static int[] arr = {5, 7, 1, 3, 2, 5, 10, 15, 20};
    static int max = arr[0], maxIndex = 0, sum = 0;
    static int min = arr[0], minIndex = 0;

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        if (minIndex < maxIndex){
            for (int i = minIndex + 1; i <= maxIndex - 1; i ++)
                sum += arr[i];
        }else{
            for (int i = maxIndex + 1; i <= minIndex - 1; i ++)
                sum += arr[i];
        }
        System.out.println(sum);

    }


}
