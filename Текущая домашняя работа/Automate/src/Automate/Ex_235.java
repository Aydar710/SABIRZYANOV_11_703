package Automate;

public class Ex_235 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("s[2ac1]dasd[5sf4sd3asd]asd[5df2]dd");
        int i = 0;
        int n = 0;
        int state = 0;
        while (i < str.length()) {
            switch (state) {
                case 0:
                    if (str.charAt(i) == '[') {
                        state = 1;
                        i++;
                        break;
                    } else {
                        i++;
                        break;
                    }
                case 1:
                    if (str.charAt(i) != ']'){
                        n++;
                        i++;
                        break;
                    }else{
                        StringBuilder ss = new StringBuilder(str.substring(i - n, i));
                        sortV(ss);
                        str.replace(i - n, i, String.valueOf(ss));
                        state = 0;
                        n = 0;
                        i++;
                        break;
                    }
            }
        }
        System.out.println(str);
    }

    public static void sortV(StringBuilder st) {

        char t;
        boolean f = true;
        while (f) {
            for (int m = 0; m < st.length(); ) {
                if (!Character.isDigit(st.charAt(m))) {
                    m++;
                    continue;
                }
                for (int j = m + 1; j < st.length(); j++) {
                    if (j == m + 1)
                        f = false;
                    if (Character.isDigit(st.charAt(j)) && Character.isDigit(st.charAt(m)) && st.charAt(m) > st.charAt(j)) {
                        t = st.charAt(m);
                        st.setCharAt(m, st.charAt(j));
                        st.setCharAt(j, t);
                        f = true;
                    }
                }
                m++;
            }
        }
    }

}





