public class Ex_52 {
    static String st1 = "cat";
    static String st2 = "blackcat";

    public static void main(String[] args) {
        if (st1.length() < st2.length())
            System.out.println(contains(st1, st2));
        else
            System.out.println(contains(st2, st1));
    }

    static boolean contains(String st1, String st2) {
        boolean f = false;
        for (int i = 0; i < st2.length() - st1.length() + 1 && !f; i++) {
            for (int k = 0; k < st1.length(); k++) {
                System.out.println(st1.charAt(k) + " " + st2.charAt(k + i));
                if (st1.charAt(k) != st2.charAt(k + i)) {
                    f = false;
                    break;
                } else if (k != 0 && st1.charAt(k) == st2.charAt(k + i))
                    f = true;
            }
        }
        return f;
    }
}
