package assginment07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    ArrayList<Vietnamese> vietnameseList;
    ArrayList<Foreign> foreignList;

    public static void main(String[] args) {
        Main m = new Main();
        Vietnamese v1 = new Vietnamese(1, "C", "2019-10-22", 41, "Sinh hoat");
        Vietnamese v2 = new Vietnamese(2, "B", "2019-01-22", 167, "Kinh doanh");
        Vietnamese v3 = new Vietnamese(3, "T", "2019-05-22", 4100, "San xuat");
        Vietnamese v4 = new Vietnamese(4, "A", "2019-06-22", 742, "Sinh hoat");
        Vietnamese v5 = new Vietnamese(5, "G", "2019-04-22", 578, "Kinh doanh");
        Vietnamese v6 = new Vietnamese(6, "V", "2019-06-22", 250, "San xuat");
        Vietnamese v7 = new Vietnamese(7, "J", "2019-07-22", 72, "Sinh hoat");
        Vietnamese v8 = new Vietnamese(8, "K", "2019-01-22", 1120, "Kinh doanh");
        Vietnamese v9 = new Vietnamese(9, "M", "2019-12-22", 351, "San xuat");
        Foreign f1 = new Foreign(11,"Q", "2019-04-22", 26, "American");
        Foreign f2 = new Foreign(12,"N", "2019-07-22", 35, "Chinese");
        Foreign f3 = new Foreign(13,"J", "2019-03-22", 64, "Canadian");
        Foreign f4 = new Foreign(14,"B", "2019-01-22", 54, "Russian");
        Foreign f5 = new Foreign(15,"X", "2019-11-22", 87, "Japanese");
        Foreign f6 = new Foreign(16,"U", "2019-10-22", 23, "French");
        Foreign f7 = new Foreign(17,"Z", "2019-05-22", 76, "British");
        Foreign f8 = new Foreign(18,"V", "2019-02-22", 16, "Korean");
        Foreign f9 = new Foreign(19,"P", "2019-01-22", 23, "Thai");
        v1.inputVietnamese();
        f5.inputForeign();
        v3.printInfo();
        f3.printInfo();
        m.vietnameseList.add(v1);
        m.vietnameseList.add(v2);
        m.vietnameseList.add(v3);
        m.vietnameseList.add(v4);
        m.vietnameseList.add(v5);
        m.vietnameseList.add(v6);
        m.vietnameseList.add(v7);
        m.vietnameseList.add(v8);
        m.vietnameseList.add(v9);
        m.foreignList.add(f1);
        m.foreignList.add(f2);
        m.foreignList.add(f3);
        m.foreignList.add(f4);
        m.foreignList.add(f5);
        m.foreignList.add(f6);
        m.foreignList.add(f7);
        m.foreignList.add(f8);
        m.foreignList.add(f9);
        m.quantityEachType();
        m.averageBill();
        m.receiptByMonth("01");
    }

    public Main() {
        vietnameseList = new ArrayList<>();
        foreignList = new ArrayList<>();
    }

    public void quantityEachType() {
        int nth = 0;
        String[] types = new String[3];
        int[] quantities = {0, 0, 0};
        for (Vietnamese v : vietnameseList) {
            if (!Arrays.asList(types).contains(v.getType())) {
                quantities[nth] += v.quantity;
                types[nth++] = v.getType();
            } else {
                for (int i = 0; i < types.length; i++) {
                    if (types[i].equals(v.getType())) {
                        quantities[i] += v.quantity;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("Loai khach hang: %-20sSo luong: %d%n", types[i], quantities[i]);
        }
    }

    public void averageBill() {
        int average = 0;
        for (Foreign f : foreignList) {
            average += f.bill;
        }
        System.out.printf("Thanh tien trung binh: %d%n", average);
    }

    public void receiptByMonth(String month) {
        for (Vietnamese v : vietnameseList) {
            if (v.receiptDate.split("-")[1].contains(month)) {
                System.out.printf("Id: %-10dTen khach hang: %-25sDoi tuong: %-15sNgay hoa don: %-15sSo luong tieu thu: %-10dThanh tien: %d%n",
                        v.id, v.name, v.getType(), v.receiptDate, v.quantity, v.bill);
            }
        }
        for (Foreign f : foreignList) {
            if (f.receiptDate.split("-")[1].contains(month)) {
                System.out.printf("Id: %-10dTen khach hang: %-25sQuoc tich: %-15sNgay hoa don: %-15sSo luong tieu thu: %-10dThanh tien: %d%n",
                        f.id, f.name, f.getNationality(), f.receiptDate, f.quantity, f.bill);
            }
        }
    }
}
