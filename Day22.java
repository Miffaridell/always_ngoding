package day22;

import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        double luas = hitungluas(panjang, lebar, tinggi);

        System.out.println("Luas permukaan balok adalah: " + luas);
    }

    public static double hitungluas(double panjang, double lebar, double tinggi) {
        double luas = ((panjang * lebar * tinggi));
        return luas;
    }
}
