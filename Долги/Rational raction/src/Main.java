public class Main {
    public static void main(String[] args) {
        RationalFraction rat = new RationalFraction(10, 3);
        RationalFraction rat2 = new RationalFraction(2, 5);
        System.out.println(rat.numberPart());
        rat.reduce();
        RationalFraction addd = rat.add(rat2);
        rat.add2(rat2);
        RationalFraction sub = rat.sub(rat2);
        rat.sub2(rat2);
        RationalFraction mult = rat.mult(rat2);
        rat.mult2(rat2);
        RationalFraction div = rat.div(rat2);
        rat.div(rat2);
        rat.div2(rat2);
        System.out.println(rat.value());
        rat.equals(rat2);
    }
}
