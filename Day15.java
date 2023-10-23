package day15;

import java.util.Stack;

public class Day15 {

    public static void main(String[] args) {
         Stack<String> random = new Stack<>();
        System.out.println("Apakah random terisi?" + random.isEmpty());
        
        random.push("miftah");
        random.push("faridl");
        random.push("majene");
        random.push("galung");
        random.push("maulid");
        System.out.println("Data Stack : " + random);
        
        System.out.println("Apakah random terisi?" + random.isEmpty());
        
        String value = random.peek();
        System.out.println("Data peek : " + value);
        System.out.println("Data Stack : " + random);
        
        value = random.pop();
        System.out.println("Data pop : " + value);
        System.out.println("Data Stack : " + random);
    }
    
}
