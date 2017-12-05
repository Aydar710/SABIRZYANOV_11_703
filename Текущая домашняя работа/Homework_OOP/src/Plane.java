public class Plane implements  Carrier {
    private String name = "Plane";
    private int cost = 25;
    private int speed = 30;



    public Plane() {
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
