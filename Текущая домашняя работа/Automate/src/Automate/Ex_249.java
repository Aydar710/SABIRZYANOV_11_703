package Automate;

public class Ex_249 {
    public static void main(String[] args) {
        String st = "s5+4addfa5-4sd5*4s asasd2+4sdsdd5/4";
        calculate(st);
    }
    static void calculate(String text) {
        int i = 0;
        int state = 0;
        double t;
        while (i < text.length()) {
            switch (state) {
                case 0:
                    if (!Character.isDigit(text.charAt(i)))
                        i++;
                    else {
                        i++;
                        state = 1;
                    }
                    break;
                case 1:
                    if (text.charAt(i) == '+'){
                        i++;
                        state = 2;
                        break;
                    }else if(text.charAt(i) == '-'){
                        i++;
                        state = 3;
                        break;
                    }else  if(text.charAt(i) == '*'){
                        i++;
                        state = 4;
                        break;
                    }else if (text.charAt(i) == '/'){
                        i++;
                        state = 5;
                        break;
                    }
                case 2:
                     t =  Character.digit(text.charAt(i - 2), 10) + Character.digit(text.charAt(i), 10);
                    System.out.println(text.charAt(i - 2) + " + " + text.charAt(i) + " = " + t);
                    i++;
                    state = 0;
                    break;
                case 3:
                    t =  Character.digit(text.charAt(i - 2), 10) - Character.digit(text.charAt(i), 10);
                    System.out.println(text.charAt(i - 2) + " - " + text.charAt(i) + " = " + t);
                    i++;
                    state = 0;
                    break;
                case 4:
                    t =  Character.digit(text.charAt(i - 2), 10) * Character.digit(text.charAt(i), 10);
                    System.out.println(text.charAt(i - 2) + " * " + text.charAt(i) + " = " + t);
                    i++;
                    state = 0;
                    break;
                case 5:
                    t = (double) Character.digit(text.charAt(i - 2), 10) / (double) Character.digit(text.charAt(i), 10);
                    System.out.println(text.charAt(i - 2) + " / " + text.charAt(i) + " = " + t);
                    i++;
                    state = 0;
                    break;
            }
        }
    }
}
