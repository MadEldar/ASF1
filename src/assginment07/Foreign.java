package assginment07;

import java.util.Scanner;

public class Foreign extends Customer{
    private String nationality;
    static int price = 2000;

    public Foreign() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap quoc tich: ");
        setNationality(scan.nextLine());
        calcBill();
    }

    public Foreign(int id, String name, String receiptDate, int quantity, String nationality) {
        super(id, name, receiptDate, quantity);
        setNationality(nationality);
        calcBill();
    }

    public void inputForeign() {
        System.out.printf("Thay doi thong tin khach hang co ma khach hang %d:%n", id);
        super.inputCustomer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap quoc tich: ");
        setNationality(scan.nextLine());
        calcBill();
    }

    @Override
    void calcBill() {
        setBill(price*quantity);
    }

    @Override
    public void printInfo() {
        System.out.printf("Id: %-10dTen khach hang: %-25sQuoc tich: %-15sNgay hoa don: %-15sSo luong tieu thu: %-10dThanh tien: %d%n",
                id, name, getNationality(), receiptDate, quantity, bill);
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
