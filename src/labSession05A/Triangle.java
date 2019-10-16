package labSession05A;

import java.util.Scanner;

public class Triangle {
    public int line1;
    public int line2;
    public int line3;

    private static int getLine() {
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        while (temp <= 0) {
            while (!scan.hasNextInt()) {
                System.out.println("A line must be a number. Enter again: ");
                scan.next();
            }
            temp = scan.nextInt();
            if (temp <= 0) {
                System.out.println("A line must be larger than 0. Enter again: ");
            }
        }
        return temp;
    }

    public void changeLine() {
        boolean triangle = false;
        while (!triangle) {
            System.out.println("Enter the first line of the triangle: ");
            line1 = Triangle.getLine();
            System.out.println("Enter the second line of the triangle: ");
            line2 = Triangle.getLine();
            System.out.println("Enter the third line of the triangle: ");
            line3 = Triangle.getLine();
            triangle = checkTriangle();
        }
    }

    public Triangle() {
        changeLine();
    }

    public boolean checkTriangle() {
        if ((line1 + line2 > line3) && (line2 + line3 > line1) && (line1 + line3 > line2)) {
            System.out.println("This is a triangle.");
            return true;
        } else {
            System.out.println("This is not a triangle.");
            return false;
        }
    }

    public int getPerimeter() {
        return line1 + line2 + line3;
    }

    public double getArea() {
        double p = (double) getPerimeter()/2;
        return Math.sqrt(p*(p - line1)*(p - line2)*(p - line3));
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
    }
}
