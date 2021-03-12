package main;

import sn.isi.entities.Medecin;
import sn.isi.entities.MedecinChef;
import sn.isi.entities.MedecinGeneraliste;
import sn.isi.entities.MedecinSpecialiste;
import sn.isi.service.IMedecin;
import sn.isi.service.IMedecinImpl;

public class main {
    public static void main(String[] args) {
        IMedecin med = new IMedecinImpl();
        Medecin m= (Medecin) med.saisie();
        med.affiche(m);

       /* MedecinGeneraliste mgen ;
        MedecinChef mc = new MedecinChef();

        mgen= (MedecinGeneraliste) med.saisie();
        mc= (MedecinChef) med.saisie();
        //MedecinSpecialiste ms= (MedecinSpecialiste) med.saisie();
        med.affiche(mgen);
        med.affiche(mc);
        //med.affiche(ms);*/
    }
}
