public class Ex_3 {
    public static void main(String[] args) {
        int n = 5555;
        String s = String.valueOf(n);
        boolean f = false;
        for (int i = 0; i < s.length() && !f; i++){
            if (s.charAt(i) % 2 == 0 || s.charAt(i) % 3 == 0)
                f = true;
        }
        System.out.println(f);
    }
}
