public class Ex_4 {
    public static void check(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int q2 = 0;
        int[][] m = {{0, 1},
                {2, 1},
                {1, 3},
                {3, 3}};
        boolean isFinishState = false;
        boolean f;
        while ((i < text.length()) && !(isFinishState)) {
            int t = array[i] - '0';
            state = m[state][t];
            if (state == 2)
                q2++;
            if (state == 3){
                isFinishState = true;
            }
            i++;
        }
        if (state == 1 && q2 > 0) {
            f = true;
            System.out.println("Есть четное вхождение нулей между двумя единицами");
        } else {
            f = false;
            System.out.println("Нет четного вхождения нулей между двумя единицами");
        }
    }

    public static void main(String[] args) {
        String words[] = {"1001", "0001","1100001", "11", "10010", "0101", "1011001", "10010001"};
        for (int i = 0; i < words.length; i++) {
            check(words[i]);
            System.out.println();
        }
    }
}
