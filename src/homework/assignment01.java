package homework;

import java.util.Arrays;
import java.util.Scanner;

class assignment01_a {
    private static boolean prime(int x) {
        int cnt = 0;
        for (int j = 1; j < x; ++j) {
            if (x % j == 0) {
                ++cnt;
            }
            if (cnt == 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n + " la:\n");
        for (int i = 1; i < n; ++i) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }
}

class assignment01_b {
    public static void main(String[] args) {
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 20; ++i) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        System.out.println("20 so dau tien trong day Fibonacci la: " + Arrays.toString(fibonacci));
    }
}