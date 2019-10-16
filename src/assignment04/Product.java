package assignment04;

import java.util.Scanner;

public class Product {
    private String id;
    private String productName;
    private int quantity;
    private int price;

    public Product() {
        inputInfo();
    }

    public void inputInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        setId(scan.nextLine());
        System.out.println("Nhap ten san pham: ");
        setProductName(scan.nextLine());
        System.out.println("Nhap so luong: ");
        setQuantity(checkInt());
        System.out.println("Nhap gia: ");
        setPrice(checkInt());
        System.out.println("Tao san pham thanh cong.");
    }

    public Product(String id, String productName, int quantity, int price) {
        setId(id);
        setProductName(productName);
        setQuantity(quantity);
        setPrice(price);
        System.out.println("Tao san pham voi thong tin thanh cong.");
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    private void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    private static int checkInt() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Du lieu phai la 1 so. Nhap lai: ");
            scan.next();
        }
        return scan.nextInt();
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public boolean checkQuantity() {
        return getQuantity() > 0;
    }
}
