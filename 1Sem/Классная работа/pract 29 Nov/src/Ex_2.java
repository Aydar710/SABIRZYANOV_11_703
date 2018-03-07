public class Ex_2 {//-
    public static void main(String[] args) {
        int min = 0;
        String n;
        int arr[] = {54055, 26656, 4654, 86565, 165465, 551564646};//was meant the number of digits in the number
        for (int i = 0; i < arr.length; i++){
            n = String.valueOf(arr[i]);
            min = n.charAt(0);
            for (int k = 1; k < n.length(); k++){
                if (n.charAt(k) < min)
                    min = n.charAt(k);
            }
            System.out.print(Character.getNumericValue(min) + " ");
        }
    }
}
