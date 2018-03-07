// Сортировка по неубыванию
public class Ex_2 {
    public static void main(String[] args) {
        int a[] = {5, 6, 5, 6, 3};
        int t;
        for (int i = 1; i < a.length; i++) {
            t = a[a.length - i];
            a[a.length - i] = findMax(a, i);
            a[findIndex(a,i)] = t;
        }
        for (int x : a)
            System.out.print(x + " ");

    }

    static int findMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i <= arr.length - n; i++) {
            if (arr[i] >= max)
                max = arr[i];
        }
        return max;
    }
    static int findIndex(int arr[], int n){
        int max = arr[0];
        int k = 0;
        for (int i = 1; i <= arr.length - n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                k = i;
            }
        }
        return k;
    }
}