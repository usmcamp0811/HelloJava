/**
 * Created by mcamp on 7/6/17.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Fraction extends Number implements Comparable<Fraction> {
    private Integer numerator;
    private Integer denominator;

    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    public float floatValue() {
        return numerator.floatValue() / denominator.floatValue();
    }

    public int intValue() {
        return numerator.intValue() / denominator.intValue();
    }

    public long longValue() {
        return numerator.longValue() / denominator.longValue();
    }

    public Integer getNumerator() {
        return numerator;
    }

    public void setNumerator(Integer numberator){
        this.numerator = numerator;
    }

    public Integer getDenominator(){
        return denominator;
    }

    public void setDenominator(Integer denominator){
        this.denominator = denominator;
    }

    public Fraction(Integer num, Integer den) {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(Integer num) {
        this.numerator = num;
        this.denominator = 1;
    }

    public Fraction add(Fraction other) {
        Integer newNum, newDen, common;

        newNum = other.getDenominator()*this.numerator + this.denominator*other.getNumerator();
        newDen = this.denominator * other.getDenominator();
        common = gcd(newNum,newDen);
        return new Fraction(newNum/common, newDen/common);
    }

    public Fraction mul(Fraction other) {
        Integer newNum, newDen, common;

        newNum = this.numerator*other.getNumerator();
        newDen = this.denominator * other.getDenominator();
        common = gcd(newNum,newDen);
        return new Fraction(newNum/common, newDen/common);
    }

    public Fraction add(Integer other) {
        return add(new Fraction(other));
    }

    public Fraction mul(Integer other) {
        return mul(new Fraction(other));
    }

    private static Integer gcd(Integer m, Integer n) {
        while(m % n != 0) {
            Integer oldm = m;
            Integer oldn = n;
            m = oldn;
            n = oldm%oldn;
        }
        return n;
    }

    public String toString() {
        return numerator.toString() + "/" + denominator.toString();
    }

    public boolean equals(Fraction other) {
        Integer num1;
        Integer num2;
        num1 = this.numerator * other.getDenominator();
        num2 = this.denominator * other.getNumerator();
        if (num1 == num2)
            return true;
        else
            return false;
    }

    public int compareTo(Fraction other) {
        Integer num1 = this.numerator * other.getDenominator();
        Integer num2 = this.denominator * other.getNumerator();
        return num1 - num2;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(1,3);
        Fraction f3 = new Fraction(23,30);
        String f1s = f1.toString();
        String f2s = f2.toString();
        Fraction f2mul = f2.mul(f1);
        Fraction f2add = f1.add(f2);
        Boolean fequal = f1.equals(f2mul);
        ArrayList<Fraction> myFracs = new ArrayList<Fraction>();
        myFracs.add(f1);
        myFracs.add(f2);
        myFracs.add(f3);
        Collections.sort(myFracs);

        System.out.println(f1s + " x " + f2s + " = " + f2mul);
        System.out.println(f1s + " + " + f2s + " = " + f2add);
        System.out.println("f2.mul(f1) == F1 is " + fequal);
//        f2.compareTo(f1) < 0 == f2 < f1 || f2.compare(f1) > 0 == f2 > f1 || f2.compareTo(f1) = 0 == SAME
        System.out.println("Compare F1 to F2: " + f2.compareTo(f1));
        System.out.println("F1 Add 1: " +  f1.add(1));
        System.out.println("F1 as Int: " + f1.intValue());
        System.out.println("F1 as Double: " + f1.doubleValue());
        System.out.println("\nSorted List of Fractions:");
        for(Fraction f : myFracs) {
            System.out.println(f);
        }





        }
}
