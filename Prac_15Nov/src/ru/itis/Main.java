package ru.itis;

public class Main {

    public static void main(String[] args) {
        Vector2D vect = new Vector2D(5, 6);

        Vector2D vv = vect.add(vect, vect);
        System.out.println(vv.a + "  " + vv.b);


        System.out.println(vect.add(vect, vect));

        vect.add2(vect, vect);
        System.out.println(vect.sub(vect, vect));

        System.out.println(vect.mult(vect, 3));

        vect.mult2(vect, 5);

        System.out.println(vect);




    }
}
