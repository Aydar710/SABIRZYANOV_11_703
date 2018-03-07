public class Ex_3 {
    public static void check(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{1, 4},
                {1, 2},
                {3, 2},
                {3, 4},
                {4, 4}};
        boolean p = false;
        boolean f;
        while ((i < text.length()) && !p) {
            int t = array[i] - '0';
            state = m[state][t];
            i++;
            if (state == 4)
                p = true;
        }
        if (state == 3){
            f = true;
            System.out.println("Правильное слова");
        } else if (state == 4) {
            f = false;
            System.out.println("Неверный порядок ");
        } else {
            f = false;
            System.out.println("Пропущена одна из частей");
        }
    }

    public static void main(String[] args) {
        String words[] = {"0110", "1100", "0","000010", "1", "1011", "0101", "000111"};
        for (int i = 0; i < words.length; i++) {
            check(words[i]);
            System.out.println();
        }
    }

}
