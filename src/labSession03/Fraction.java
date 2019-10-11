package labSession03;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        setFraction();
    }

    public Fraction(int a) {}

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        System.out.printf("Da nhap tu so %d va mau so %d.%n", numerator, denominator);
    }

    private int getNumerator() {
        return numerator;
    }

    private void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private int getDenominator() {
        return denominator;
    }

    private void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private int getInt() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Phai nhap so. Xin nhap lai: ");
            scan.next();
        }
        return scan.nextInt();
    }

    private void setFraction() {
        System.out.println("Nhap tu so: ");
        setNumerator(getInt());
        System.out.println("Nhap mau so: ");
        int dem = 0;
        while (dem == 0) {
            dem = getInt();
            if (dem == 0) {
                System.out.println("Mau so phai khac 0");
            }
        }
        setDenominator(dem);
        if ((numerator < 0 && denominator < 0) || (numerator > 0 && denominator < 0)) {
            numerator = -numerator;
            denominator = -denominator;
        }
        System.out.println("Da nhap tu so va mau so.");
    }

    public void printFraction() {
        System.out.printf("Phan so da nhap la: %d/%d%n", getNumerator(), getDenominator());
    }

    public void reduceFraction() {
        for (int i = Math.min(Math.abs(numerator), Math.abs(denominator)); i >= 1; --i) {
            if (numerator % i == 0 && denominator % i == 0) {
                setNumerator(numerator /= i);
                setDenominator(denominator /= i);
                break;
            }
        }
        System.out.printf("Phan so sau khi rut gon la: %d/%d%n", numerator, denominator);
    }

    public void inverseFraction() {
        if (numerator < 0) {
            setNumerator(-denominator);
            setDenominator(-numerator);
            System.out.printf("Phan so nghich dao la: %d/%d%n", getNumerator(), getDenominator());
        } else {
            setNumerator(denominator);
            setDenominator(numerator);
            System.out.printf("Phan so nghich dao la: %d/%d%n", getNumerator(), getDenominator());
        }
    }

    private static int findCommonDenominator(int a, int b) {
        int higherDem = Math.max(a, b);
        int lowerDem = Math.min(a, b);
        while (higherDem % lowerDem != 0) {
            higherDem += Math.max(a, b);
        }
        return higherDem;
    }

    public static Fraction add(Fraction a, Fraction b) {
        Fraction newFrac = new Fraction(0);
        if (a.denominator == b.denominator) {
            newFrac.numerator = a.numerator + b.numerator;
            newFrac.denominator = a.denominator;
        } else {
            int commonDem = findCommonDenominator(a.denominator, b.denominator);
            newFrac.numerator = a.numerator * (commonDem/a.denominator) + b.numerator * (commonDem/b.denominator);
            newFrac.denominator = commonDem;
        }
        newFrac.reduceFraction();
        return newFrac;
    }

    public static Fraction sub(Fraction a, Fraction b) {
        Fraction newFrac = new Fraction(0);
        if (a.denominator == b.denominator) {
            newFrac.numerator = a.numerator - b.numerator;
            newFrac.denominator = a.denominator;
        } else {
            int commonDem = findCommonDenominator(a.denominator, b.denominator);
            newFrac.numerator = a.numerator * (commonDem/a.denominator) - b.numerator * (commonDem/b.denominator);
            newFrac.denominator = commonDem;
        }
        newFrac.reduceFraction();
        return newFrac;
    }

    public static Fraction mul(Fraction a, Fraction b) {
        Fraction newFrac = new Fraction(0);
        newFrac.numerator = a.numerator * b.numerator;
        newFrac.denominator = a.denominator * b.denominator;
        newFrac.reduceFraction();
        return newFrac;
    }

    public static Fraction div(Fraction a, Fraction b) {
        Fraction newFrac = new Fraction(0);
        newFrac.numerator = a.numerator * b.denominator;
        newFrac.denominator = a.denominator * b.numerator;
        if ((newFrac.numerator < 0 && newFrac.denominator < 0) || (newFrac.numerator > 0 && newFrac.denominator < 0)) {
            newFrac.numerator = -newFrac.numerator;
            newFrac.denominator = -newFrac.denominator;
        }
        newFrac.reduceFraction();
        return newFrac;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(6, 8);
        f1.printFraction();
        f2.printFraction();
        f2.reduceFraction();
        f1.inverseFraction();
        add(f1, f2);
        sub(f1, f2);
        mul(f1, f2);
        div(f1, f2);
    }
}
