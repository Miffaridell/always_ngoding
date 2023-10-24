package day16;
import java.util.Stack;
public class Day16 {

    public static void main(String[] args) {
    Stack<Integer> Stack = new Stack<>();
    
    Stack.push(2004);
    Stack.push(2023);
    
    while(!Stack.isEmpty()){
        System.out.println(Stack.pop());
    }
    }
    
}
