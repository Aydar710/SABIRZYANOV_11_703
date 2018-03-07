public class Ex_1 {
    public static void main(String[] args) {
        String words[] = {"01100", "0", "1", "10010", "1000", "0101", "0011"};
        for (int i = 0; i < words.length; i++) {
            subword(words[i]);
            System.out.println();
        }
    }
    public static void subword(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{0, 1},
                {2, 1},
                {2, 2}};
        boolean f = false;
        while ((i < text.length()) && !f) {
            int t = array[i] - '0';
            state = m[state][t];
            i++;
            if (state == 2)
                f = true;
        }
        if (state == 2) {
            f = true;
            System.out.println("Есть подслово 10");
        } else {
            f = false;
            System.out.println("No");
        }
    }

    
}
