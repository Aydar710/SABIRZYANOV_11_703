public class Ex_4 {
    public static void main(String[] args) {
        int a[][] = {{3, 2, 3}, {2, 3, 1}, {4, 1, 4}};
        boolean f = true;
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && f)
                break;
            for (int k = 0; k < a.length; k++) {
                if (k != 0  && f)
                    break;
                f = true;
                for (int n = 0; f && n < a[k].length; n++) {
                    if (a[i][n] != a[n][k]) {
                        f = false;
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        if (f)
            System.out.println("Есть строка, совпадающая со столбцом");
        else
            System.out.println("Нет строки, совпадающей со столбцом");
    }

}

