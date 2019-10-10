package homework;

import java.util.Scanner;

class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int workHour;

    public NhanVien() {
        System.out.println("Created a new employee.");
    }

    public NhanVien(String name, int age, String address, double salary, int workHour) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.workHour = workHour;
        System.out.println("Created a new employee with full information.");
    }

        private String getName () {
        return name;
    }

        private void setName (String name){
        this.name = name;
    }

        private int getAge () {
        return age;
    }

        private void setAge ( int age){
        this.age = age;
    }

        private String getAddress () {
        return address;
    }

        private void setAddress (String address){
        this.address = address;
    }

        private double getSalary () {
        return salary;
    }

        private void setSalary ( double salary){
        this.salary = salary;
    }

        private int getWorkHour () {
        return workHour;
    }

        private void setWorkHour ( int workHour){
        this.workHour = workHour;
    }

    public void inputInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your name: ");
        setName(scan.nextLine());
        System.out.println("Please input your age: ");
        int tempAge = 0;
        while (tempAge <= 0) {
            while (!scan.hasNextInt()) {
                System.out.println("Numbers only. Please input your age again: ");
                scan.next();
            }
            tempAge = scan.nextInt();
            if (tempAge <= 0) {
                System.out.println("Age must be a positive number. Please input your age again: ");
            }
        }
        setAge(tempAge);
        System.out.println("Please input your address: ");
        scan.nextLine();
        setAddress(scan.nextLine());
        System.out.println("Please input your salary: ");
        double tempSalary = 0;
        tempSalary = 0;
        while (tempSalary <= 0) {
            while (!scan.hasNextDouble()) {
                System.out.println("Numbers only. Please input your salary again: ");
                scan.next();
            }
            tempSalary = scan.nextDouble();
            if (tempSalary <= 0) {
                System.out.println("Salary must be a positive number. Please input your salary again: ");
            }
        }
        setSalary(tempSalary);
        System.out.println("Please input your work hour: ");
        int tempWorkHour = -1;
        while (tempWorkHour < 0) {
            while (!scan.hasNextDouble()) {
                System.out.println("Numbers only. Please input your work hour again: ");
                scan.next();
            }
            tempWorkHour = scan.nextInt();
            if (tempWorkHour <= 0) {
                System.out.println("Work hour must be a positive number. Please input your work hour again: ");
            }
        }
        setWorkHour(tempWorkHour);
        scan.close();
        System.out.println("Da nhap thong tin nhan vien thanh cong");
    }

    public void printInfo() {
        System.out.printf("Name: %s%nAge: %d%nAddress: %s%nSalary: %.2f%nWork hour: %d%n", getName(), getAge(), getAddress(), getSalary(), getWorkHour());
    }

    public double tinhThuong() {
        if (workHour >= 200) {
            return salary*0.2;
        } else if (workHour >= 100) {
            return salary*0.1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        NhanVien nv1 = new NhanVien();
        nv1.inputInfo();
        nv1.printInfo();
        double bonus1 = nv1.tinhThuong();
        System.out.printf("This month your bonus is %.2f%n", bonus1);
        NhanVien nv2 = new NhanVien("Le Huy Hai", 20, "Nha", 2000, 201);
        double bonus2 = nv2.tinhThuong();
        System.out.printf("This month your bonus is %.2f%n", bonus2);
    }
}

class TamGiac {
    private int line1;
    private int line2;
    private int line3;

    private static int getLine() {
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        while (temp <= 0) {
            while (!scan.hasNextInt()) {
                System.out.println("A line must be a number. Enter again: ");
                scan.next();
            }
            temp = scan.nextInt();
            if (temp <= 0) {
                System.out.println("A line must be larger than 0. Enter again: ");
            }
        }
        return temp;
    }

    public TamGiac() {
        boolean triangle = false;
        while (!triangle) {
            System.out.println("Enter the first line of the triangle: ");
            line1 = TamGiac.getLine();
            System.out.println("Enter the second line of the triangle: ");
            line2 = TamGiac.getLine();
            System.out.println("Enter the third line of the triangle: ");
            line3 = TamGiac.getLine();
            triangle = checkTriangle();
        }
    }

    public boolean checkTriangle() {
        if ((line1 + line2 > line3) || (line1 > line2 + line3) || (line1 + line3 > line2)) {
            System.out.println("This is a triangle.");
            return true;
        } else {
            System.out.println("This is not a triangle.");
            return false;
        }
    }

    public void getPerimeter() {
        System.out.printf("The perimeter of the triangle is %d%n", (line1 + line2 + line3)/2);
    }

    public void getArea() {
        int p = (line1 + line2 + line3)/2;
        System.out.printf("The area of the triangle is %.2f%n", Math.sqrt(p*(p - line1)*(p - line2)*(p - line3)));
    }

    public static void main(String[] args) {
        TamGiac tri = new TamGiac();
        tri.getPerimeter();
        tri.getArea();
    }
}