public class Ex_226 {
    public static void main(String[] args) {
        String st[] = {"C", "D", "F", "E", "B", "A"}; //why only one letter?
        sort(st);
        for (int i = 0; i < st.length; i++){
            System.out.print(st[i] + " ");
        }

    }

    static String[] sort(String arr[]) {
        String st;
        boolean f = true;
        for (int i = arr.length - 1; i > 0 && f; i--) {
            f = false;
            for (int j = 0; j < i; j++) {
                if (arr[j].charAt(0) > arr[j + 1].charAt(0)) {
                    st = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = st;
                    f = true;
                }
            }
        }
        return arr;
    }
}
