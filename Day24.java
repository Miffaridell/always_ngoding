package day24;

public class Day24 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int i = 0;
        int sum = 0;

        do {
            System.out.println("numbers: " + numbers[i]);
            sum += numbers[i];
            i++;
        } while (i < numbers.length);

        System.out.println("Jumlah dari semua angka: " + sum);
    }
}
