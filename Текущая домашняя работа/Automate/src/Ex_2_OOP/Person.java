package Ex_2_OOP;

public class Person {
    private String name;
    private int age;
    private boolean isRetired;
    private boolean car;
    private boolean home;
    private boolean isChild;
    private boolean ishealthy;
    private int money;

    public Person(String name, int age, boolean car, boolean home, boolean ishealthy, int money) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.home = home;
        this.ishealthy = ishealthy;
        this.money = money;
    }

    public void isRetired(int age) {
        this.isRetired = age > 55 ? true : false;
    }

    public void isChild(int age) {
        this.isChild = age < 18 ? true : false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public boolean isHome() {
        return home;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public boolean isChild() {
        return isChild;
    }

    public void setChild(boolean child) {
        isChild = child;
    }

    public boolean isIshealthy() {
        return ishealthy;
    }

    public void setIshealthy(boolean ishealthy) {
        this.ishealthy = ishealthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
