package Ex_2_OOP;

public class Main {
    public static void main(String[] args) {
        Tax tax = new Tax();
        PensionFund pension = new PensionFund();
        Person putin = new Person("Putin", 65, true, true, true, 100);
        Person sunOfPutin = new Person("Вовочка", 17, false, true, false, 99999999);
        Person microDistrict[] = {putin, sunOfPutin};
        for (int i = 0; i < microDistrict.length; i++){
            microDistrict[i].isRetired(microDistrict[i].getAge());
            System.out.println("Общая сумма налога для " + microDistrict[i].getName() + " составляет: " +tax.takeMoney(microDistrict[i]) );
            System.out.println("Пенсия у " + microDistrict[i].getName() + " = " + pension.giveMoney(microDistrict[i]));
            System.out.println("Сумма на банковском счете " + microDistrict[i].getMoney());
        }

    }
}
