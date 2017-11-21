import java.util.Scanner;//-

public class Ex_9_g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        double n = in.nextDouble();
        double m = 1;
        double sum = 1;


        while (m <= n) {
            sum += 1 / ((2 * m + 1) * 9); //incorrect formula
            m++;
        }
        System.out.println(sum);
    }
}
