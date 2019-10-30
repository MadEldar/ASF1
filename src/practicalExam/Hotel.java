package practicalExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    private String name;
    private String owner;
    private String location;

    public Hotel() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hotel's name: ");
        setName(scan.nextLine());
        System.out.println("Enter owner's name: ");
        setOwner(scan.nextLine());
        System.out.println("Enter hotel's location: ");
        setLocation(scan.nextLine());
        System.out.println("Hotel created.");
    }

    public Hotel(String name, String owner, String location) {
        setName(name);
        setOwner(owner);
        setLocation(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
