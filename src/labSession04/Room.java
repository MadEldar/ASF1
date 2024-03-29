package labSession04;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    private String roomName;
    private String location;
    private ArrayList<User> userList;

    public Room() {
        Scanner scan = new Scanner(System.in);
        userList = new ArrayList<>();
        System.out.println("Nhap ten phong: ");
        setRoomName(scan.nextLine());
        System.out.println("Nhap vi tri phong: ");
        setLocation(scan.nextLine());
        System.out.println("Tao phong thanh cong.");
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

    private void removeUser(String id){
        for (User u: this.userList) {
            if (u.getId().equals(id)) {
                this.userList.remove(u);
                return;
            }
        };
        System.out.println("Khong tim thay nguoi dung.");
    }

    private void getRoomInfo() {
        System.out.printf("Ten phong: %-20sVi tri: %s%nDanh sach nguoi dung:%n", this.getRoomName(), this.getLocation());
        for (User u:this.userList) {
            System.out.printf("Ten nguoi: %-20sTuoi: %-10dChung minh nhan dan: %s%n", u.getName(), u.getAge(), u.getId());
        }
    }

    public static void main(String[] args) {
        User nam = new User("Le Van Nam", 21, "132");
        User nu = new User("Nguyen Thi Nu", 18, "232");
        User kxd = new User("Tran Minh Chi", 22, "342");
        Room r1 = new Room();
        r1.addUser(nam);
        r1.addUser(nu);
        r1.addUser(kxd);
        r1.removeUser("342");
        r1.getRoomInfo();
    }
}
