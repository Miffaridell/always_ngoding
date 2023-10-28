package day20;
import java.util.Scanner;
public class day20 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan koordinat x1: ");
        double x1 = input.nextDouble();
        System.out.print("Masukkan koordinat y1: ");
        double y1 = input.nextDouble();
        System.out.print("Masukkan koordinat x2: ");
        double x2 = input.nextDouble();
        System.out.print("Masukkan koordinat y2: ");
        double y2 = input.nextDouble();

        double jarak = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Jarak antara titik (" + x1 + ", " + y1 + ") dan titik (" + x2 + ", " + y2 + ") adalah: " + jarak);

        input.close();
    }
}

        