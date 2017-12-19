package Ex_2_OOP;

public class Insurance implements Office {
    @Override
    public int giveMoney(Person person) {
        if (!person.isIshealthy()) person.setMoney(person.getMoney() + 50);
        return person.getMoney();
    }

    @Override
    public int takeMoney(Person person) {
        return 0;
    }


}
