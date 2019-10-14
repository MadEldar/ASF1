package assignment04;

import java.util.Scanner;

public class Product {
    private String id;
    private String productName;
    private int quantity;
    private int price;

    public Product() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        setId(scan.nextLine());
        System.out.println("Nhap ten san pham: ");
        setProductName(scan.nextLine());
        System.out.println("Nhap so luong: ");
        setQuantity(checkInt(scan.nextInt()));
        System.out.println("Nhap gia: ");
        setPrice(checkInt(scan.nextInt()));
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

    private static int checkInt(int a) {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Du lieu phai la 1 so. Nhap lai: ");
            scan.next();
        }
        scan.close();
        return a = scan.nextInt();
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

    public void checkQuantity() {
        System.out.println((getQuantity() > 0) ? "San pham con hang trong kho.":"San pham het hang.");
    }
}
