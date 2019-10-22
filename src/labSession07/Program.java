package labSession07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int studentId;
        while (true) {
            System.out.println("\nMenu: \n1. Add student.\n2. Edit student by id.\n3. Delete student by id.");
            System.out.println("4. Sort student by gpa\n5. Sort student by name.\n6. Show student.\n0. Exit.");
            if (scan.hasNextInt()) {
                switch (scan.nextInt()) {
                    case 1:
                        studentList.add(new Student());
                        break;
                    case 2:
                        System.out.println("Nhap ma sinh vien de chinh sua: ");
                        studentId = scan.nextInt();
                        for (Student s : studentList) {
                            if (s.getId() == studentId) {
                                s.setInfo();
                                break;
                            }
                        }
                        System.out.println("Khong tim thay sinh vien.");
                        break;
                    case 3:
                        System.out.println("Nhap ma sinh vien de chinh xoa: ");
                        studentId = scan.nextInt();
                        for (Student s : studentList) {
                            if (s.getId() == studentId) {
                                studentList.remove(s);
                                break;
                            }
                        }
                        System.out.println("Khong tim thay sinh vien.");
                        break;
                    case 4:
                        studentList.sort(Comparator.comparing(Student::getGpa).reversed());
                        break;
                    case 5:
                        studentList.sort(Comparator.comparing(Student::getName));
                        break;
                    case 6:
                        for (Student s : studentList) {
                            System.out.printf("Ma sinh vien: %-10dTen: %-25sTuoi: %-10dDia chi: %-30sDiem trung binh: %.1f%n",
                                    s.getId(), s.getName(), s.getAge(), s.getAddress(), s.getGpa());
                        }
                        break;
                    case 0:
                        return;
                }
            } else {
                System.out.println("Nhap sai cu pha");
                scan.next();
            }
        }
    }
}
