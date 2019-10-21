package labSession07;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private float gpa;

    public Student() {
        System.out.println("Nhap ma sinh vien: ");
        setId(getInt());
        setInfo();
    }

    public Student(int id, String name, int age, String address, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public void setInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        setName(scan.nextLine());
        System.out.println("Nhap tuoi: ");
        setAge(getInt());
        System.out.println("Nhap dia chi: ");
        setAddress(scan.nextLine());
        System.out.println("Nhap diem trung binh: ");
        setGpa(scan.nextFloat());
    }

    public int getInt() {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            if (!scan.hasNextInt()) {
                System.out.println("Du lieu phai la so. Nhap lai: ");
            }
            n = scan.nextInt();
            if (n <= 0) {
                System.out.println("So phai lon hon 0. Nhap lai: ");
            }
        }
        return n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
