package day11;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai :");
        nilai = input.nextInt();

        if (nilai >= 80) {
            System.out.println("NILAI ANDA A");
        } else if (nilai >= 60) {
            System.out.println("NILAI ANDA B");
        } else if (nilai >= 40) {
            System.out.println("NILAI ANDA C");
        } else {
            System.out.println("NILAI ANDA ERROR");
        }
    }
    {
        }
    }

