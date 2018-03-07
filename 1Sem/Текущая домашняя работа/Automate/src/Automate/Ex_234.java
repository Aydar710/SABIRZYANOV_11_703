package Automate;

import java.util.Scanner;

public class Ex_234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        String num;
        do {
            System.out.println("Введите двоичное число");
            num = in.nextLine();
        } while (!chek(num));

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1')
                sum += Math.pow(2, num.length() - i - 1);
        }
        System.out.println(sum);
    }


    static boolean chek(String num) {
        int state = 0;
        int i = 0;
        while (i < num.length()) {
            switch (state) {
                case 0:
                    if (num.charAt(i) != '0' && num.charAt(i) != '1')
                        state = 1;
                    else i++;
                    break;
                case 1:
                    return false;
            }
        }
        return true;
    }
}
