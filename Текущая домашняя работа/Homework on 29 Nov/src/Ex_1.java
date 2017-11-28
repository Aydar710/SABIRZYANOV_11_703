public class Ex_1 { //-
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        for (int i = 3; i >= 0; i--) {
            a[i][0] = i + 1;
        }
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
        for (int i = 0; i < a.length; i++){
            if (b[0] <= a[i][0]){
                for (int k = 0; k < a[i].length; k++){
                    a[i][k] = b[k];           //I did not mean to replace the row of the matrix, but to add
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




}
