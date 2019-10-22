package assginment07;

import java.util.Scanner;

public class Vietnamese extends Customer {
    private String type;
    static int[] price = {1000, 1200, 1500, 2000};
    static int[] rate = {50, 50, 100, 0};

    public Vietnamese() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap doi tuong khach hang: ");
        setType(scan.nextLine());
        calcBill();
    }

    public Vietnamese(int id, String name, String receiptDate, int quantity, String type) {
        super(id, name, receiptDate, quantity);
        setType(type);
        calcBill();
    }

    public void inputVietnamese() {
        System.out.printf("Thay doi thong tin khach hang co ma khach hang %d:%n", id);
        super.inputCustomer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap doi tuong khach hang: ");
        setType(scan.nextLine());
        calcBill();
    }

    @Override
    void calcBill() {
        int n = quantity;
        int bill = 0;
        for (int i = 0; i < 4; i++) {
            if (n > rate[i] && i != 3) {
                bill += price[i]*rate[i];
                n -= rate[i];
            } else {
                bill += price[i]*n;
            }
        }
        setBill(bill);
    }

    @Override
    public void printInfo() {
        System.out.printf("Id: %-10dTen khach hang: %-25sDoi tuong: %-15sNgay hoa don: %-15sSo luong tieu thu: %-10dThanh tien: %d%n",
                id, name, getType(), receiptDate, quantity, bill);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
