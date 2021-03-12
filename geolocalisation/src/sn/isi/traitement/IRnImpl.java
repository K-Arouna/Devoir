package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IRnImpl implements IRn{
    @Override
    public Rn saisie() {
        Scanner sc = new Scanner(System.in);
        List<Zone> zones = new ArrayList<Zone>();

        Rn r = new Rn();
        String rep=null;
        System.out.println("Saisir l'id de la Rn: ");
        r.setId(Integer.parseInt(sc.nextLine()));
        do {
            Zone zone = new Zone();
            System.out.println("Saisir l'id de la Zone: ");
            zone.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Saisir le nom de la Zone: ");
            zone.setNom(sc.nextLine());
            System.out.println("Saisir la longitude la Zone: ");
            zone.setLongitude(Double.parseDouble(sc.nextLine()));
            System.out.println("Saisir la latitude de la Zone: ");
            zone.setLatitude(Double.parseDouble(sc.nextLine()));
            zones.add(zone);
            System.out.println("Voulez vous aujmenter une autre Zone o/n: ");
            rep = sc.nextLine();
           }while ((rep.equalsIgnoreCase("o")));

        r.setZones(zones);
        System.out.println("Saisir la longitude la Route: ");
        r.setLatitude(Double.parseDouble(sc.nextLine()));
        System.out.println("Saisir la latitude la Route: ");
        r.setLongitude(Double.parseDouble(sc.nextLine()));

        return r;
    }

    @Override
    public void affichage(Rn rn) {
        List<Zone> zones = new ArrayList<Zone>();
        zones = rn.getZones();
            System.out.println("l'id->"+rn.getId());
        for (Zone zo:zones)
        {
            System.out.println("--------------------Affichage Rn--------------------");
            System.out.println("l'id de sa  zone->"+zo.getId());
            System.out.println("le nom de sa  zone->"+zo.getNom());
            System.out.println("la latitude de sa  zone->"+zo.getLatitude());
            System.out.println("la longitude de sa  zone->"+zo.getLongitude());
        }
        System.out.println("la latitude de la Route  ->"+rn.getLatitude());
        System.out.println("la longitude de la Route  ->"+rn.getLongitude());



    }
}
