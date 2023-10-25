package day17;

import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama hari:");
        String stringhari = scanner.nextLine();

        switch (stringhari) {
            case "senin":
            case "selasa":
            case "rabu":
            case "kamis":
            case "jumat":
                System.out.println("normal day");
                break;
            case "sabtu":
            case "minggu":
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}
