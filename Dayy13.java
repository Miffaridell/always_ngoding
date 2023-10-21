
package dayy13;

import java.util.ArrayList;


public class Dayy13 {

    public static void main(String[] args) {
        ArrayList <String> random = new ArrayList<String>();
        random.add("immiftah");
        random.add("faridelll");
        random.add("140604");
        random.add("170");
        random.add("78");
        
        
        System.out.print("["); 
        for (int i = 0; i < random.size(); i++) {
            if(i > 0){
                System.out.print(" , ");
            }
            System.out.print(random.get(i));
            
        }System.out.print("]");
        
    }
    
}
