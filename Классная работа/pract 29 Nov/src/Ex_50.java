public class Ex_50 {

    public static void main(String[] args) {
        String s1 = "Bla-Bla";
        String s2 = "Bla-Bla";
        boolean f = true;
        if (s1.length() != s2.length())
            f = false;
        for (int i = 0; i < s1.length() && f; i++){
            if (s1.charAt(i) != s2.charAt(i))
                f = false;
        }
        System.out.println(f);
    }
}
