package day21;

import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double luas = hitungLuas(sisi);

        System.out.println("Luas permukaan kubus adalah: " + luas);
    }

    public static double hitungLuas(double sisi) {
        double luas = sisi * sisi;
        return luas;
    }
}
