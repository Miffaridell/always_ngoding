package day10;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka :");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("bilangan positif");
        } else if (angka < 0) {
            System.out.println("bilangan negatif");
        } else {
            System.out.println("nol");
        }
    }

}
