package Ex_2_OOP;

public class PensionFund implements Office {
    private int pension = 23;
    @Override
    public int giveMoney(Person person) {
        if (person.isRetired()) {
            person.setMoney(person.getMoney() - this.pension);
            return this.pension;
        }
        return 0;
    }


    @Override
    public int takeMoney(Person person) {
        return 0;
    }

    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }
}
