package day33;

import java.util.Scanner;

public class Day33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        int squared = nilai * nilai;
        int doubled = nilai * 2;

        String evenOdd = (nilai % 2 == 0) ? "even" : "odd";

        System.out.println("Nilai dari " + nilai + ": Square=" + squared + ", Double=" + doubled + ", " + evenOdd);

        scanner.close();
    }
}
