package labSession04;

import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private String id;

    public User() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        setName(scan.nextLine());
        System.out.println("Nhap tuoi: ");
        setAge(scan.nextInt());
        scan.nextLine();
        System.out.println("Nhap chung minh nhan dan: ");
        setId(scan.nextLine());
        System.out.println("Tao nguoi dung thanh cong.");
    }

    public User(String name, int age, String id) {
        setName(name);
        setAge(age);
        setId(id);
        System.out.println("Tao nguoi dung voi thong tin thanh cong.");
    }

    public void showInfo() {
        System.out.printf("Ten: %s%nTuoi: %d%nChung minh nhan dan: %s%n", getName(), getAge(), getId());
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        Scanner scan = new Scanner(System.in);
        while (age <= 0) {
            while (!scan.hasNextInt()) {
                System.out.println("Tuoi phai la 1 so. Nhap lai:");
                scan.next();
            }
            age = scan.nextInt();
            if (age <= 0) {
                System.out.println("Tuoi phai lon hon 0. Nhap lai: ");
            }
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }
}
