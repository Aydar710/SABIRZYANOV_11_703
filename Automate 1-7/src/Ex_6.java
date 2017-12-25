public class Ex_6 {

    public static void chet(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{2, 1},
                {3, 0},
                {0, 3},
                {1, 2}};
        boolean f;
        while ((i < text.length())) {
            int t = array[i] - '0';
            state = m[state][t];
            i++;
        }
        if (state == 0) {
            f = true;
            System.out.println("В слове четное кол-во 0 и 1");
        } else {
            f = false;
            System.out.println("В слове нечетное кол-во 0 или 1 или (0 и 1)");
        }
    }

    public static void main(String[] args) {
        String words[] = {"01010", "1100", "0", "000010", "1", "", "1011", "0101", "000001111"};
        for (int i = 0; i < words.length; i++) {
            chet(words[i]);
            System.out.println();
        }
    }
}
