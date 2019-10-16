package labSession05B;

public class Student extends Person {
    public Student() {
        System.out.println("Tao doi tuong sinh vien thanh cong.");
    }

    public boolean checkAge() {
        return Integer.parseInt(getBirthday().split("-")[0]) <= 2019 - 18;
    }

    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println( stud.checkAge() ? "Sinh vien du 18 tuoi" : "Sinh vien chua du 18 tuoi" );
    }
}
