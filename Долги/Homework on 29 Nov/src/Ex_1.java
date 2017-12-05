public class Ex_1 { // Есть вопрос по задаче.
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        a[0][0] = 3;
        a[1][0] = 4;
        a[2][0] = 6;
        a[3][0] = 8;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        int b[] = {5, 6, 4, 8};
        for (int i = 0; i <= a.length - 2; i++) {
            if (b[0] <= a[i][0]) {
                moveColumn(a, i);
                for (int k = 0; k < b.length; k++) {
                    a[i][k] = b[k];
                }
                break;
            }

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void moveColumn(int[][] matrix, int n) {
        for (int i = matrix.length - 1; i >= n; i--) {
            matrix[i] = matrix[i - 1];
        }
    }


}
