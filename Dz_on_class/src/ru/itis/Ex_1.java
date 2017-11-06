package ru.itis;
// 1) сосчитать кол-во эл. массива равных его мин элементу за один проход по массиву
public class Ex_1 {
    static int arr[] = {5, 4, 1, 5, 1, 3, 1, 4, 1, 6}, min = arr[0], n = 0;

    public static void main(String[] args) {
        for (int i = 1; i < arr.length; i++){
            if(arr[i] == min){
                n++;
            }else if (arr[i] < min){
                min = arr[i];
                n = 0;

            }
        }
        System.out.println(n);
    }
}
