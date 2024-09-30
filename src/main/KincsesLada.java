package main;

import modell.JatekModell;
import nezet.Felugronezet;
import nezet.Konzolnezet;
import vezerlo.FelugroVezerlo;
import vezerlo.KonzolVezerlo;


public class KincsesLada {

 
    public static void main(String[] args) {
      //new JatekModell();
        JatekModell modell = new JatekModell();
        
        //Konzolnezet nezet = new Konzolnezet();
        //new KonzolVezerlo(modell, nezet);
        
        Felugronezet nezet = new Felugronezet();
        new FelugroVezerlo(modell, nezet);
    }
    
}
