package day35;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        Scanner miftah = new Scanner(System.in);

        System.out.print("jumlah Nasi kuning  anda : ");
        int pesanan = miftah.nextInt();

        System.out.print("jumlah pesanan: ");
        int jumlahKotak = miftah.nextInt();

        int kotakTerisi;
        int sisaKotak;

        kotakTerisi = pesanan / jumlahKotak;
        sisaKotak = pesanan % jumlahKotak;

        System.out.println("jumlah kotak telah terisi: " + kotakTerisi);
        System.out.println("sisa nasi kuning yang belum terkeep: " + sisaKotak);
    }

}
