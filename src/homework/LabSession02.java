package homework;

import java.util.Scanner;

class SoNguyenTo {
    public int a = 5;

    public void isSoNguyenTo () {
        System.out.println((checkPrime(a)) ? "a la 1 so nguyen to." : "a khong phai 1 so nguyen to.");
    }

    public void timSoNguyenToTiepTheo () {
        System.out.printf("So nguyen to tiep theo cua %d la %d.%n", a, nextPrime(a));
    }

    public void setA() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap 1 so tu nhien thay cho a: ");
        int x = scan.nextInt();
        if ((checkPrime(x))) {
            this.a = x;
        } else {
            System.out.println("Khong thay doi gia tri cua a");
        }
    }

    private static boolean checkPrime(int x) {
        for (int i = 2; i < x/2; ++i) {
            if (x % i == 0) return false;
        }
        return true;
    }

    private static int nextPrime(int x) {
        return (checkPrime(++x)) ? x : nextPrime(x);
    }

    public static void main(String[] args) {
        SoNguyenTo so = new SoNguyenTo();
        so.isSoNguyenTo();
        so.timSoNguyenToTiepTheo();
        so.setA();
    }
}
