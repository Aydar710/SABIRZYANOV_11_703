public class Ex_5 {
    public static void checkZero(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{1, 1},
                {2, 2},
                {0, 3},
                {3, 3}};
        boolean p = false;
        boolean f;
        if (text.length() < 3) {
            f = false;
            System.out.println("Слишком короткая цепочка");
        } else {
            while ((i < text.length()) && !p) {
                int t = array[i] - '0';
                state = m[state][t];
                i++;
                if (state == 3) {
                    p = true;
                }
            }
            if (state != 3) {
                f = true;
                System.out.println("На каждом 3ем месте - 0");
            } else {
                f = false;
                System.out.println("Не удовлетворяет");
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"1001", "101", "1100001", "00", "110", "000"};
        for (int i = 0; i < words.length; i++) {
            checkZero(words[i]);
            System.out.println();
        }
    }
}
