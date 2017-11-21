package Matrix;

import java.util.Random;

public class Change_on_1_el_upper_n_main_diag {   //bad classname
    public static void main(String[] args) {
        Homevork_Sd sd = new Homevork_Sd();  //!!!!!!
        Random r = new Random();
        int arr[][] = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i - 1; j++) {
                arr[i][j] = 1;
            }
        }
        sd.showMatrix(arr);
    }
}
