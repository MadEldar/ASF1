package practicalExam;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelList {
    public ArrayList<Hotel> hotelList;

    public static void main(String[] args) {
        HotelList list = new HotelList();
        list.hotelList.add(new Hotel("The Pretty Reckless", "Taylor Momsen", "666 Highway To Hell"));
        list.hotelList.add(new Hotel("My Chemical Romance", "Gerard Way", "73 New Jersey"));
        list.hotelList.add(new Hotel("Shinedown", "Brent Smith", "53 Jacksonville"));
        list.hotelList.add(new Hotel("Fall Out Bot", "Joe Trohman", "40/295 Glenview"));
        list.hotelList.add(new Hotel("Black Veil Brides", "Adam Biersack", "88 Delhi"));
        list.hotelList.add(new Hotel("Halestorm", "Lizzy Hale", "43 Pennsylvania"));
        list.hotelList.add(new Hotel("System of A Down", "Serj Tankian", "55 Los Angeles"));
        list.hotelList.add(new Hotel("Arctic Monkeys", "Alex Turner", "21 Shelffield"));
        list.hotelList.add(new Hotel("Seether", "Shaun Morgan", "31 Pretoria"));
        list.hotelList.add(new Hotel("Three Days Grace", "Adam Gontier", "10 Ontorio"));
        list.getList();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the hotel's owner's name: ");
        list.findHotel(scan.nextLine());
    }

    public HotelList() {
        hotelList = new ArrayList<>();
    }

    public void getList() {
        for (Hotel hotel : this.hotelList) {
            System.out.printf("Owner: %-20sHotel's Name: %-30sLocation: %s%n", hotel.getOwner(), hotel.getName(), hotel.getLocation());
        }
        System.out.println("");
    }

    public void findHotel(String owner) {
        for (Hotel hotel : this.hotelList) {
            if (hotel.getOwner().equals(owner)) {
                System.out.printf("Owner: %-20sHotel's Name: %-30sLocation: %s%n", hotel.getOwner(), hotel.getName(), hotel.getLocation());
            }
        }
    }
}
