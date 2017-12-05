public class Ex_50 {
    public static void main(String[] args) {
        String st1 = "Hello";
        String st2 = "HeLLo";
        boolean f = true;
        if (st1.length() == st2.length()) {
            for (int i = 0; i < st1.length() && f; i++) {
                if ((st1.toLowerCase()).charAt(i) == (st1.toLowerCase()).charAt(i))
                    f = true;
                else
                    f = false;
            }
            System.out.println(f);
        } else
            System.out.println(!f);

    }

}