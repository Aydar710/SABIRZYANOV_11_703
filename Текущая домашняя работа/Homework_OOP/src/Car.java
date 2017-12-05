public class Car implements Carrier {
    private String name = "Car";
    private int cost = 10;
    private int speed = 5;


    public Car(String name, int cost, int speed) {
        this.name = name;
        this.cost = cost;
        this.speed = speed;
    }



    @Override
    public int countMovement(int distance) {
        return cost * distance;
    }

    @Override
    public int countTime(int distance) {
        return distance / speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
