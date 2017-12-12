public class RationalFraction {
    int numerator = 5;
    int denominator = 7;

    RationalFraction() {
    }

    public RationalFraction(int numerator, int denaminator) {
        this.numerator = numerator;
        this.denominator = denaminator;
    }

    public void reduce() {
        int nod = findNod(this.numerator, this.denominator);
        System.out.println(this.numerator / nod + "/" + this.denominator / nod);
    }

    public RationalFraction add(RationalFraction rat1) {
        RationalFraction result = new RationalFraction();
        result.denominator = rat1.numerator * this.denominator;
        result.numerator = (result.denominator / rat1.denominator * rat1.numerator) + (result.denominator / this.denominator * this.numerator);
        return advancedReduce(rat1);
    }

    void add2(RationalFraction rat) {
        int denominator = rat.numerator * this.denominator;
        this.numerator = (this.denominator / rat.denominator * rat.numerator) + (denominator / rat.denominator * rat.numerator);
        this.denominator = rat.denominator * this.denominator;
        System.out.println(this.numerator);
        System.out.println(this.denominator);
    }

    RationalFraction sub(RationalFraction rat1) {
        RationalFraction result = new RationalFraction();
        result.denominator = rat1.numerator * this.denominator;
        result.numerator = (result.denominator / rat1.denominator * rat1.numerator) - (result.denominator / this.denominator * this.numerator);
        return advancedReduce(rat1);
    }

    void sub2(RationalFraction rat) {
        int denominator = rat.numerator * this.denominator;
        this.numerator = (this.denominator / rat.denominator * rat.numerator) - (denominator / rat.denominator * rat.numerator);
        this.denominator = rat.denominator * this.denominator;
        System.out.println(this.numerator);
        System.out.println(this.denominator);
    }

    RationalFraction mult(RationalFraction rat) {
        RationalFraction result = new RationalFraction();
        result.numerator = this.numerator * rat.numerator;
        result.denominator = this.denominator * rat.denominator;
        return advancedReduce(rat);
    }

    void mult2(RationalFraction rat) {
        this.numerator = this.numerator * rat.numerator;
        this.denominator = this.denominator * rat.denominator;
    }

    RationalFraction div(RationalFraction rat) {
        RationalFraction result = new RationalFraction();
        result.numerator = this.numerator * rat.denominator;
        result.denominator = this.denominator * rat.numerator;
        return advancedReduce(rat);
    }

    void div2(RationalFraction rat) {
        this.numerator = this.numerator * rat.denominator;
        this.denominator = this.denominator * rat.numerator;
        System.out.println(advancedReduce(rat));
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double value() {
        return (double) numerator / (double) denominator;
    }
    boolean equals(RationalFraction rat2){
        RationalFraction rat1 = new RationalFraction();
        rat1.numerator = this.numerator;
        rat1.denominator = this.denominator;
        rat1.numerator = rat2.denominator * rat1.numerator;
        rat2.numerator = rat1.denominator * rat2.numerator;
        rat1.denominator = rat1.denominator * rat2.denominator;
        rat2.denominator = rat1.denominator * rat2.denominator;
        advancedReduce(rat1);
        advancedReduce(rat2);
        if (rat1.numerator > rat2.numerator)
            return true;
        else
            return false;
    }
    int numberPart(){
        return this.numerator / this.denominator;
    }

    public static int findNod(int numerator, int denominator) {     // Не входит в условие задачи
        int max = numerator > denominator ? numerator : denominator;
        int nod = 0;
        for (int i = 2; i <= max; i++) {
            if (numerator % i == 0 && denominator % i == 0)
                nod = i;
        }

        return nod >= 2? nod: 1;
    }

    public static RationalFraction advancedReduce(RationalFraction rat) {   // Не входит в условие задачи
        int nod = findNod(rat.numerator, rat.denominator);
        rat.numerator /= nod;
        rat.denominator /= nod;
        return rat;
    }
}
