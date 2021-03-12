package main;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;
import sn.isi.traitement.IEcole;
import sn.isi.traitement.IEcoleImpl;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        IEcole ie = new IEcoleImpl();
        Map<Specialite,Ecole> map = new HashMap<Specialite,Ecole>();
        map = ie.saisie();
        ie.affichageSpecialite(map);
        ie.affichageEcole(map);
    }
}
