
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 123452160;
        String s = String.valueOf(n);
        System.out.println(s);
        char max = s.charAt(0);
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) > max)
                max = s.charAt(i);
        }
        System.out.println(max);
    }
}