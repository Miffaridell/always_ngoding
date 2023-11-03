package day26;

public class Day26 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int i = 0;
        double avg = 0;

        do {
            System.out.println("numbers: " + numbers[i]);
            avg += numbers[i];
            i++;
        } while (i < numbers.length);

        avg /= numbers.length;
        System.out.println("Rata rata semua angka yakni: " + avg);
    }
}
