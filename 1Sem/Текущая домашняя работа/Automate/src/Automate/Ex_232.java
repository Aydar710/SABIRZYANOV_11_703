package Automate;

public class Ex_232 {
    public static void main(String[] args) {
        String st = "abccdfgd";
        boolean f = true;
        for (int i = 0; i < st.length(); i++){
            for (int k = 0; k < st.length() && f; k++){
                if (st.charAt(i) == st.charAt(k) && i != k)
                    f = false;
            }
            if (f){
                System.out.print(st.charAt(i) + " ");
                f = true;
            }
            f = true;
        }
    }
}