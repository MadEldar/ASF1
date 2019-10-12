package assignment03;

import sun.text.normalizer.UCharacter;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String id;
    private double averageScore;
    private int age;
    private String classroom;

    public Student() {
        inputInfo();
    }

    public Student(String id, double averageScore, int age, String classroom) {
        setId(id);
        setAverageScore(averageScore);
        setAge(age);
        setClassroom(classroom);
        System.out.println("Tao sinh vien moi thanh cong.");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void inputInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien 8 ki tu: ");
        String input = scan.nextLine();
        while (input.length() < 8) {
            System.out.println("Ma sinh vien phai co 8 ki tu. Hay nhap lai: ");
            input = scan.nextLine();
        }
        setId(input.substring(0, 7));
        System.out.println("Nhap diem trung binh: ");
        double tempAS = -1;
        while (tempAS < 0 || tempAS > 10) {
            while (!scan.hasNextDouble()) {
                System.out.println("Diem trung binh phai la 1 so. Hay nhap lai: ");
                scan.next();
            }
            tempAS = scan.nextDouble();
            if (tempAS < 0 || tempAS > 10) {
                System.out.println("Diem trung binh phai nam trong khoang tu 0 dem 10. Hay nhap lai: ");
            }
        }
        setAverageScore(tempAS);
        System.out.println("Nhap tuoi: ");
        int tempAge = 0;
        while (tempAge < 18) {
            while (!scan.hasNextInt()) {
                System.out.println("Tuoi phai la 1 so. Hay nhap lai: ");
                scan.next();
            }
            tempAge = scan.nextInt();
            if (tempAge < 18) {
                System.out.println("Tuoi phai lon hon hoac bang 18. Hay nhap lai: ");
            }
        }
        setAge(tempAge);
        System.out.println("Nhap lop: ");
        scan.nextLine();
        String tempClassroom = "z";
        while (tempClassroom.indexOf("A") != 0 && tempClassroom.indexOf("C") != 0) {
            tempClassroom = scan.nextLine();
            if (tempClassroom.indexOf("A") != 0 && tempClassroom.indexOf("C") != 0) {
                System.out.println("Lop phai bat dau bang ki tu A hoac C. Hay nhap lai: ");
            }
        }
        setClassroom(tempClassroom);
        System.out.println("Nhap thong tin thanh cong.");
    }

    public void showInfo() {
        System.out.printf("Ma sinh vien: %s%nDiem trung binh: %.1f%nTuoi: %d%nLop: %s%n",
                getId(), getAverageScore(), getAge(), getClassroom());
    }

    public void xetHocBong() {
        System.out.println((getAverageScore() >= 8.0)
                ? "Sinh vien co the nhan hoc bong." : "Sinh vien khong the nhan hoc bong");
    }

    public static void main(String[] args) {
        Student anh = new Student();
        anh.showInfo();
        anh.xetHocBong();
        Student hai = new Student("TH1904012", 9.0, 20, "CAMT014");
        hai.showInfo();
        hai.xetHocBong();
    }
}
