public class Ex_3 {
    public static void main(String[] args) {
        int a [][] = {{1, 2, 3}, {2, 3, 1}, {1, 3}, {1, 2, 3}};
        boolean f = true;
        boolean m = false;
        for (int i = 0; i < a.length - 1; i++){
            for (int j = i + 1; j < a.length && !m; j++){
                if (f && j != 1)
                    m = true;
                else
                    f = true;
                for (int k = 0; k < a[i].length && f && a[i].length == a[j].length; k++){
                    if (a[i][k] != a[j][k])
                        f = false;

                }
            }
        }
        if (m)
            System.out.println("Есть одинаковые строки");
        else
            System.out.println("Нет одинаковых строк");
    }
}
