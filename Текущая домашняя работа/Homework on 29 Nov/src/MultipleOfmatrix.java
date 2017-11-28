public class MultipleOfmatrix {
    // 2 задание. Вызывается в классе Main
    public static void mult(int a[][], int b[][]) {
        if (check(a, b)) {
            int result[][] = new int[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            for (int i = 0; i < result.length; i++) {
                for (int k = 0; k < result[i].length; k++) {
                    System.out.print(result[i][k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean check(int a[][], int b[][]) {
        if (a[0].length == b.length) {
            System.out.println("Матрицы можно перемножать");
            return true;
        } else {
            System.out.println("Матрицы невозможно перемножить");
            return false;
        }
    }
}

