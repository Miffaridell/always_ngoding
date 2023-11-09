package day32;

public class Day32 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int nomor : numbers) {
            int nilai = nomor * nomor;
            int doubled = nomor * 2;
            System.out.println("nilai dari" + nomor + "=" + nilai + ", Double=" + doubled);
        }
    }
}
