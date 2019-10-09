package homework;

import java.util.Scanner;

class SoNguyenTo {
    private static boolean isSoNguyenTo(int x) {
        for (int i = 2; i < x/2; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int timSoNguyenToTiepTheo(int x) {
        while (true) {
            if (isSoNguyenTo(x)) {
                return x;
            } else {
                ++x;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao 1 so tu nhien:");
        int a = scan.nextInt();

        if (isSoNguyenTo(a)) {
            System.out.printf("%d la 1 so nguyen to.", a);
        } else {
            System.out.printf("%d khong phai 1 so nguyen to.", a);
        }

        System.out.printf("%nSo nguyen to tiep theo cua %d la %d.%n", a, timSoNguyenToTiepTheo(a));

        System.out.println("Thay doi so a voi so: ");
        int x = scan.nextInt();
        if (isSoNguyenTo(x)) {
            a = x;
            System.out.printf("a da duoc gan gia tri %d", x);
        } else {
            System.out.println("Khong thay doi gia tri a");
        }
    }
}
