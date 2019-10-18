package assignment05;

import java.util.ArrayList;

public class PhoneBook extends Phone {
    private ArrayList<Person> phoneList;

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Nam", "01234");
        pb.insertPhone("Nam", "12340");
        pb.insertPhone("Nam", "31230");
        pb.insertPhone("Nu", "01298");
        pb.insertPhone("Nu", "01234");
        pb.insertPhone("Nam", "01234");
        pb.printPhoneBook();
        pb.removePhone("Nu");
        pb.insertPhone("Nu", "01234");
        pb.searchPhone("Nu");
        pb.updatePhone("Nu", "01245");
        pb.sort();
        pb.printPhoneBook();
    }

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }

    public void insertPhone(String name, String phone) {
        for (Person p:phoneList) {
            if (p.getName().equals(name)) {
                if (!p.getPhone().contains(phone)) {
                    p.setPhone(p.getPhone() + " : " + phone);
                }
                return;
            }
        }
        Person person = new Person(name, phone);
        phoneList.add(person);
    }

    public void removePhone(String name) {
        for (Person p:phoneList) {
            if (p.getName().equals(name)) {
                phoneList.remove(p);
                return;
            }
        }
    }

    public void updatePhone(String name, String newPhone) {
        for (Person p:phoneList) {
            if (p.getName().equals(name)) {
                p.setPhone(newPhone);
            }
        }
    }

    public void searchPhone(String name) {
        for (Person p:phoneList) {
            if (p.getName().equals(name)) {
                System.out.println("So dien thoai cua nguoi dung la: " + p.getPhone());
            }
        }
    }

    public void sort() {
        phoneList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
    }

    public void printPhoneBook() {
        System.out.println("Danh sach nguoi dung: ");
        for (Person p:phoneList) {
            System.out.printf("Ten: %-10sSo dien thoai: %s%n", p.getName(), p.getPhone());
        }
    }
}
