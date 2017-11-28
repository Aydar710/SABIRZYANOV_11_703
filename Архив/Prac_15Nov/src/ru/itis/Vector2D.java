package ru.itis;

import java.util.Vector;

public class Vector2D {
    double a;
    double b;

    public Vector2D() {
        a = 0;
        b = 0;
    }


    public Vector2D(double x, double y) {
        a = x;
        b = y;
    }

    public Vector2D add(Vector2D a, Vector2D b) {
        Vector2D vect = new Vector2D((a.a + b.a), (a.b + b.b));
        return vect;
    }

    public void add2(Vector2D a, Vector2D b) {
        a.a = a.a + b.a;
        a.b = a.b + b.b;
        System.out.println(a.a + "  " + b.b);
    }

    public Vector2D sub(Vector2D a, Vector2D b) {
        Vector2D vect2 = new Vector2D((a.a - b.a), (a.b - b.b));
        return vect2;
    }

    public Vector2D mult(Vector2D a, double b) {
        Vector2D vect3 = new Vector2D((a.a * b), (a.b * b));
        return vect3;
    }

    public void mult2(Vector2D a, double b) {
        a.a = a.a * b;
        a.b = a.b * b;
        System.out.println(a.a + " " + a.b);//bad idea
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "a = " + a +
                ", b = " + b +
                '}';
    }

    public double length(Vector2D a) {
        return Math.sqrt(a.a * a.a + a.b * a.b);
    }

    double scalarProduct(Vector2D a, Vector2D b) {
        return a.a * b.a + a.b * b.b;
    }

    public double cos(Vector2D a, Vector2D b) {
        return scalarProduct(a, b) / (length(a) * length(b));
    }



    boolean equals(Vector2D a) {
        return (this.a == a.a) && (this.b == a.b);
    }
}
