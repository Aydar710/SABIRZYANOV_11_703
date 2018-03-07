public class Ex_2 {
    public static void check(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{1, 2},
                {1, 2},
                {3, 2},
                {3, 4},
                {4, 4}};
        boolean p = false;
        boolean f = false;
        while ((i < text.length()) && !p) {
            int t = array[i] - '0';
            state = m[state][t];
            i++;
            if (state == 4)
                p = true;
        }
        if (state != 4) {
            f = true;
            System.out.println("The word is true");
        } else {
            f = false;
            System.out.println("The word is false");
        }
    }

    public static void main(String[] args) {
        String words[] = {"0110", "1100", "0", "1", "1011", "0101", "000111"};
        for (int i = 0; i < words.length; i++) {
            check(words[i]);
            System.out.println();
        }
    }
}
