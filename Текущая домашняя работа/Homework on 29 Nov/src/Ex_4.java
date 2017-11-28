public class Ex_4 {
    public static void main(String[] args) {
        int a[][] = {{7, 2, 3}, {4, 3, 4}, {3, 4, 3}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        boolean f = true;
        boolean m = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length && !m; j++) {
                if (f && a[i][j] != a[j][i] && i != j)
                    m = true;
                else
                    f = true;
                for (int k = 0; k < a[i].length && f ; k++) {
                    if (a[i][k] != a[k][j])
                        f = false;
                }
            }
        }
        if (m || f)
            System.out.println("Есть строка, совпадающая со столбцом");
        else
            System.out.println("Нет строки, совпадающей со столбцом");
    }
}

