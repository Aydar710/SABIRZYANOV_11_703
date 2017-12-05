// Сортировка по убыванию
public class Ex_3 {
    public static void main(String[] args) {
        int a[] = {5, 7, 2, 8, 6};
        int t;
        int ind = 0;
        for (int i = 1; i < a.length; i++) {
            t = a[i - 1];
            ind = findIndex(a,i);
            a[i - 1] = findMax(a, i);
            a[ind] = t;
        }
        for (int x : a)
            System.out.print(x + " ");

    }

    static int findMax(int arr[], int n) {
        int max = arr[n - 1];
        for (int i = n; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    static int findIndex(int arr[], int n){
        int max = arr[n - 1];
        int k = n - 1;
        for (int i = n; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                k = i;
            }
        }
        return k;
    }
}