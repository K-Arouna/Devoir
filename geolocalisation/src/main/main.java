package main;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;
import sn.isi.traitement.IRn;
import sn.isi.traitement.IRnImpl;
import sn.isi.traitement.IZone;
import sn.isi.traitement.IZoneImpl;

public class main {
    public static void main(String[] args) {
       // IZone izo = new IZoneImpl();
        IRn ir = new IRnImpl();
        //Zone zone = new Zone();
        Rn r = new Rn();

        System.out.println("saisie Rn");
        //zone = izo.saisie();
        System.out.println("saisie Rn");
        r = ir.saisie();

        //izo.affichage(zone);
        ir.affichage(r);
    }
}
