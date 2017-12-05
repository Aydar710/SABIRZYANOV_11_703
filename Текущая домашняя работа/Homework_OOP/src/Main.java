// Решение 12

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int distance = 6;

        Plane plane = new Plane();
        Train train = new Train("Train", 25, 15);
        Car car = new Car("Car", 16, 12);
        Carrier[] arr = createArr(plane, train, car);
        System.out.println("Cтоимость полета на " + plane.getName() + " - " + plane.countMovement(distance) + " . Время полета " + plane.countTime(distance));
        System.out.println("Cтоимость поездки на " + train.getName() + " - " + train.countMovement(distance) + " . Время Поездки " + train.countTime(distance));
        System.out.println("Cтоимость поездки на " + car.getName() + " - " + car.countMovement(distance) + " . Время Поездки " + car.countTime(distance));

    }

    static Carrier[] createArr(Plane plane, Train train, Car car) {
        Carrier c[] = {plane, train, car};
        return c;
    }
}
