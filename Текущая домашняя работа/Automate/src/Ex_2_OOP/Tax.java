package Ex_2_OOP;

public class Tax implements Office {
    private  int taxOnCar = 50;
    private  int getTaxOnHome = 100;


    @Override
    public int giveMoney(Person person) {
        return 0;
    }

    @Override
    public int takeMoney(Person person) {
        if (person.isRetired() && person.isCar() && person.isHome()) return 0;
        if (person.isChild()) return 0;
        int sum = 0;
        int price[] = {this.taxOnCar, this.getTaxOnHome};
        boolean arr[] = {person.isCar(), person.isHome()};
        for (int i = 0; i < arr.length; i++){
            if (arr[i]) sum+= price[i];
        }
        person.setMoney(person.getMoney() - sum);
        return sum;
    }

    public int getTaxOnCar() {
        return taxOnCar;
    }

    public void setTaxOnCar(int taxOnCar) {
        this.taxOnCar = taxOnCar;
    }

    public int getGetTaxOnHome() {
        return getTaxOnHome;
    }

    public void setGetTaxOnHome(int getTaxOnHome) {
        this.getTaxOnHome = getTaxOnHome;
    }
}
