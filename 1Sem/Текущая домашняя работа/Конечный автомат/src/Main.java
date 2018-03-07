public class Main {

    public static void main(String[] args) {
        String words[] = {"бээ!", "б", "", "бэээээ!", "бэ", "!"};
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i] + "               " + chat(words[i]));
        }
    }

    static boolean chat(String text) {
        char array[] = text.toCharArray();
        int state = 1;
        int i = 0;
        while (i < text.length()) {
            switch (state) {
                case 1:
                    if (array[i] == 'б') {
                        state++;
                        i++;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (array[i] == 'э') {
                        state++;
                        i++;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    if (array[i] == 'э') {
                        i++;
                    } else {
                        state = 4;
                    }
                    break;
                case 4:
                    if (array[i] == '!')
                        return true;
                    else return false;
            }
        }
        return false;
    }
}
