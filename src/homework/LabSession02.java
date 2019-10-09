package homework;

import java.util.Scanner;

class SoNguyenTo {
    private static boolean isSoNguyenTo(int x) {
        for (int i = 2; i < x/2; ++i) {
            if (x % i == 0) return false;
        }
        return true;
    }

    private static int timSoNguyenToTiepTheo(int x) {
        return (isSoNguyenTo(++x)) ? x : timSoNguyenToTiepTheo(x);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao 1 so tu nhien:");
        int a = scan.nextInt();

        System.out.println((isSoNguyenTo(a)) ? "a la 1 so nguyen to." : "a khong phai 1 so nguyen to.");

        System.out.printf("%nSo nguyen to tiep theo cua %d la %d.%n", a, timSoNguyenToTiepTheo(a));

        System.out.println("Thay doi so a voi so: ");
        int x = scan.nextInt();
        if (isSoNguyenTo(x)) {
            a = x;
            System.out.printf("a da duoc gan gia tri %d", a);
        } else {
            System.out.println("Khong thay doi gia tri cua a");
        }
    }
}
