package dayy25;

public class Dayy25 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int i = 0;
        int avg = 0;

        do {
            System.out.println("numbers: " + numbers[i]);
            avg += numbers[i];
            i++;
        } while (i < numbers.length);

        System.out.println("Rata rata semua angka yakni: " + avg);
    }
}
