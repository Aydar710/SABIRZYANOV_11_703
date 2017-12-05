public class Ex_3 {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {2, 3, 1}, {1, 3}, {1, 2, 3}};
        boolean f = true;
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && f)
                break;
            for (int k = i + 1; k < a.length; k++) {
                if (k != i + 1 && f)
                    break;
                else if (a[i].length != a[k].length)
                    continue;
                f = true;
                for (int n = 0; f && n < a[k].length; n++) {
                    if (a[i][n] != a[k][n]) {
                        f = false;
                    }
                }
            }
        }
        if (f)
            System.out.println("Есть одинаковые строки");
        else
            System.out.println("Нет одинаковых строк");
    }
}
