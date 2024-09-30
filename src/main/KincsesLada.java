package main;

import modell.JatekModell;
import nezet.CuiNezet;
import nezet.Felugronezet;
import nezet.Konzolnezet;
import vezerlo.CuiVezerlo;
import vezerlo.FelugroVezerlo;
import vezerlo.KonzolVezerlo;


public class KincsesLada {

 
    public static void main(String[] args) {
      //new JatekModell();
        JatekModell modell = new JatekModell();
        
        //Konzolnezet nezet = new Konzolnezet();
        //new KonzolVezerlo(modell, nezet);
        
        //Felugronezet nezet = new Felugronezet();
        //new FelugroVezerlo(modell, nezet);
        
        CuiNezet nezet;
        //nezet = new Konzolnezet();
        //new KonzolVezerlo (modell, nezet);
        nezet = new Felugronezet();
        new CuiVezerlo(modell, nezet);
    }
    
}
