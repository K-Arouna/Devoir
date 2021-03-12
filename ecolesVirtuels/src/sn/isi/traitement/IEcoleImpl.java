package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.*;

public class IEcoleImpl implements IEcole{
    Scanner sc = new Scanner(System.in);

    @Override
    public Map<Specialite, Ecole> saisie() {
        Map<Specialite,Ecole> map = new HashMap<>();
        String rep = null;
        do {
            Specialite spe = new Specialite();
            Specialite speEcole = new Specialite();
            Ecole e = new Ecole();
            System.out.println("---------------------Saisie Specialite---------------------");
            System.out.println("Donner l'id de la Specilite");
            spe.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Donner le nom de la Specilite");
            spe.setNom(sc.nextLine());
            System.out.println("---------------------Saisie Ecole---------------------");
            System.out.println("Donner l'id de l'ecole ");
            e.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Donner  le Nom de l'ecole");
            spe.setNom(sc.nextLine());
            System.out.println("Donner l'id de la Specilite de l'ecole");
            speEcole.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Donner le nom de la Specilite de l'ecole");
            speEcole.setNom(sc.nextLine());
            e.setSpecialite(speEcole);
            System.out.println("Voulez vous saisir encore ? O/N");
            rep = sc.nextLine();
            map.put(spe,e);
         }while (rep.equalsIgnoreCase("o"));

        return map;
    }

    //----------------------------------------------------------------------------------------------------------//
    @Override
    public void affichageSpecialite(Map<Specialite , Ecole > maps) {

        System.out.println("---------------------Affichage Specialite---------------------");
        for (Specialite sp : maps.keySet()){
            System.out.println("l'id de la specialite   ->"+sp.getId());
            System.out.println("le nom de la specialite ->"+sp.getNom());
        }
    }
//----------------------------------------------------------------------------------------------------------//
    @Override
    public void affichageEcole(Map<Specialite, Ecole> maps) {

        for (Ecole e: maps.values()){
            System.out.println("---------------------Saisie Ecole---------------------");
            System.out.println("l'id de l'Ecole         ->"+e.getId());
            System.out.println("le nom de l'Ecole       ->"+e.getNom());
            System.out.println("id specialite de l'ecole->"+e.getSpecialite().getId());
            System.out.println("Nom specialite de l'ecole->"+e.getSpecialite().getNom());
        }
    }

}
