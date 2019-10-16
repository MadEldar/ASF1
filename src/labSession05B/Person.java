package labSession05B;

import java.util.Scanner;

public class Person {
    private String name;
    private String sex;
    private String birthday;
    private String address;

    public Person() {
        inputInfo();
    }

    public Person(String name, String sex, String birthday, String address) {
        setName(name);
        setSex(sex);
        setBirthday(birthday);
        setAddress(address);
        System.out.println("Da tao doi tuong.");
    }

    public void inputInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        setName(scan.nextLine());
        System.out.println("Nhap gioi tinh: ");
        setSex(scan.nextLine());
        System.out.println("Nhap ngay sinh (yyyy-mm-dd): ");
        setBirthday(scan.nextLine());
        System.out.println("Nhap dia chi: ");
        setAddress(scan.nextLine());
        System.out.println("Nhap thong tin thanh cong.");
    }

    public void showInfo() {
        System.out.printf("Ten: %-20sGioi tinh: %-10sNgay sinh: %-15sDia chi: %s",
                getName(), getSex(), getBirthday(), getAddress());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
