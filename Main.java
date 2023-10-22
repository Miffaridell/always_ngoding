package arraylist;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        
        angka.add(14);
        angka.add(20);
        angka.add(24);
        
        int angkapertama= angka.get(0);
        System.out.println("Elemen pertama: " + angkapertama);
    }
    
}
    
