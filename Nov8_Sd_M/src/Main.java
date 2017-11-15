import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
// МАТРИЦЫ
    public static int[] minColumns(int matrix[][]) {
        int min;
        int mins[] = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            min = matrix[i][0];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < min)
                    min = matrix[j][i];
            }
            mins[i] = min;
        }
        return mins;
    }


    public static void main(String[] args) {

        int sizeOfMatrix = in.nextInt();
        int matrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int min;
        System.out.println("------");
/*        for (int i = 0; i < matrix.length; i++) {
            min = matrix[i][0];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < min)
                    min = matrix[j][i];
            }
            System.out.print(min + " ");
        }
        System.out.println("func");
*/
        System.out.println(Arrays.toString(minColumns(matrix)));

    }


}

