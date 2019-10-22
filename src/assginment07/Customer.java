package assginment07;

import java.util.Scanner;

public abstract class Customer {
    int id;
    String name;
    String receiptDate;
    int quantity;
    int bill;

    public Customer() {
        System.out.println("Nhap ma khach hang: ");
        setId(getInt());
        inputCustomer();
    }

    public void inputCustomer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        setName(scan.nextLine());
        System.out.println("Nhap ngay ra hoa don (yyyy-mm-dd): ");
        setReceiptDate(scan.nextLine());
        System.out.println("Nhap so luong tieu thu: ");
        setQuantity(getInt());
    }

    public Customer(int id, String name, String receiptDate, int quantity) {
        this.id = id;
        this.name = name;
        this.receiptDate = receiptDate;
        this.quantity = quantity;
    }

    private int getInt() {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            while (!scan.hasNextInt()) {
                System.out.println("Du lieu phai la so. Nhap lai: ");
                scan.next();
            }
            n = scan.nextInt();
            if (n <= 0) {
                System.out.println("So phai lon hon 0. Nhap lai: ");
            }
        }
        return n;
    }

    abstract void calcBill();
    abstract void printInfo();

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
}
