package nezet;

import java.util.Scanner;


public class Konzolnezet {
    private static final Scanner sc = new Scanner(System.in);
    
    public void megjelenit(String uzenet) {
        System.out.println(uzenet);
        
    }
    public int bekeres() {
        megjelenit("Melyik ládában van a kincs?(1,2,3)");
        return sc.nextInt() - 1;
        
    }
}

