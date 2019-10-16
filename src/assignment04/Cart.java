package assignment04;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Cart {
    private String id;
    private String customerName;
    private double total;
    private ArrayList<Product> productList;
    private String city;

    public Cart() {
        Scanner scan = new Scanner(System.in);
        productList = new ArrayList<>();
        System.out.println("Nhap ma gio hang: ");
        setId(scan.nextLine());
        System.out.println("Nhap ten khach hang: ");
        setCustomerName(scan.nextLine());
        System.out.println("Nhap thanh pho cua khach hang: ");
        setCity(scan.nextLine());
        scan.close();
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotal() {
        return total;
    }

    private void setTotal(double total) {
        this.total = total;
    }

    public String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public void addProduct(Product p) {
        if (productList.contains(p)) {
            System.out.println("San pham da co trong gio hang.");
            return;
        }
        System.out.println("San pham da duoc them vao gio hang.");
        productList.add(p);
    }

    public void removeProduct(Product p) {
        if (!productList.contains(p)) {
            System.out.println("San pham khong co trong gio hang.");
            return;
        }
        System.out.println("Xoa san pham khoi gio hang thanh cong.");
        productList.remove(p);
    }

    public void removeProduct(String productId) {
        productList.removeIf(product -> product.getId().equals(productId));
    }

    public void checkout() {
        if (productList.size() > 0) {
            setTotal(0);
            for (Product p:productList) {
                setTotal(total += p.getPrice()*p.getQuantity());
            }
            setTotal(total += total/((getCity().equals("HN") || getCity().equals("HCM")) ? 100 : 50));
            System.out.printf("Tong gia tien cua gio hang la: %.2f.%n", getTotal());
        } else {
            System.out.println("Gio hang khong co san pham");
        }
    }

    public void getCartInfo() {
        System.out.printf("Ma gio hang: %-15sTen khach hang: %-20sThanh pho: %s%nCac san pham trong don hang:\n",
                getId(), getCustomerName(), getCity());
        if (productList.size() == 0) {
            System.out.println("Gio hang khon cos san pham nao.");
            return;
        }
        for (Product p:productList) {
            System.out.printf("Product id: %-15sProduct name: %-20sProduct quantity: %-5dProduct price: %d%n",
                    p.getId(), p.getProductName(), p.getQuantity(), p.getPrice());
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("11", "Moxpad X3", 6, 450);
        Product p2 = new Product("12", "Moxpad X6", 0, 700);
        Product p3 = new Product("13", "Moxpad X9", 1, 860);
        Product p4 = new Product("14", "MEE Audio X10", 3, 2190);
        Product p5 = new Product("15", "MEE Audio X1 Sport", 7, 680);
        if (p1.checkQuantity()) {
            System.out.println("San pham con hang");
        } else {
            System.out.println("San pham het hang");
        }
        Cart hai = new Cart();
        hai.addProduct(p1);
        hai.addProduct(p2);
        hai.addProduct(p3);
        hai.addProduct(p4);
        hai.addProduct(p5);
        hai.removeProduct(p2);
        hai.removeProduct(p5.getId());
        hai.getCartInfo();
        hai.checkout();
    }
}
