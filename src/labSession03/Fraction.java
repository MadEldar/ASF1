package labSession03;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        setFraction();
    }

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
        for (int i = 2; i <= Math.min(Math.abs(numerator), Math.abs(denominator)); ++i) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i--;
            }
        }
        System.out.printf("Phan so sau khi rut gon la: %d/%d%n", numerator, denominator);
    }

    public static void reduceFraction(int num, int dem) {
        for (int i = 2; i <= Math.min(Math.abs(num), Math.abs(dem)); ++i) {
            if (num % i == 0 && dem % i == 0) {
                num /= i;
                dem /= i--;
            }
        }
        System.out.printf("Rut gon: %d/%d%n", num, dem);
    }

    public void inverseFraction() {
        if (numerator < 0) {
            System.out.printf("Phan so nghich dao la: %d/%d%n", -denominator, -numerator);
        } else {
            System.out.printf("Phan so nghich dao la: %d/%d%n", denominator, numerator);
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

    public static void add(Fraction a, Fraction b) {
        int num, dem;
        if (a.denominator == b.denominator) {
            num = a.numerator + b.numerator;
            dem = a.denominator;
        } else {
            int commonDem = findCommonDenominator(a.denominator, b.denominator);
            num = a.numerator * (commonDem/a.denominator) + b.numerator * (commonDem/b.denominator);
            dem = commonDem;
        }
        System.out.printf("Ket qua cong 2 phan so la: %d/%d. ", num, dem);
        reduceFraction(num, dem);
    }

    public static void sub(Fraction a, Fraction b) {
        int num, dem;
        if (a.denominator == b.denominator) {
            num = a.numerator - b.numerator;
            dem = a.denominator;
        } else {
            int commonDem = findCommonDenominator(a.denominator, b.denominator);
            num = a.numerator * (commonDem/a.denominator) - b.numerator * (commonDem/b.denominator);
            dem = commonDem;
        }
        System.out.printf("Ket qua tru 2 phan so la: %d/%d. ", num, dem);
        reduceFraction(num, dem);
    }

    public static void mul(Fraction a, Fraction b) {
        int num = a.numerator * b.numerator;
        int dem = a.denominator * b.denominator;
        System.out.printf("Ket qua nhan 2 phan so la: %d/%d. ", num, dem);
        reduceFraction(num, dem);
    }

    public static void div(Fraction a, Fraction b) {
        int num = a.numerator * b.denominator;
        int dem = a.denominator * b.numerator;
        if ((num < 0 && dem < 0) || (num > 0 && dem < 0)) {
            num = -num;
            dem = -dem;
        }
        System.out.printf("Ket qua chia 2 phan so la: %d/%d. ", num, dem);
        reduceFraction(num, dem);
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
