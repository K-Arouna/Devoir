package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IZoneImpl implements IZone{
    @Override
    public Zone saisie() {
        Scanner sc = new Scanner(System.in);
        Zone zo = new Zone();
        System.out.println("Saisir l'id de la Zone: ");
        zo.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Saisir le nom de la Zone: ");
        zo.setNom(sc.nextLine());
        System.out.println("Saisir la longitude la Zone: ");
        zo.setLongitude(sc.nextInt());
        System.out.println("Saisir la latitude de la Zone: ");
        zo.setLatitude(sc.nextInt());
        return zo;
    }

    @Override
    public void affichage(Zone zo) {
        System.out.println("--------------------Affichage Zone--------------------");
        System.out.println("l'id de sa  zone->        "+zo.getId());
        System.out.println("le nom de sa  zone->      "+zo.getNom());
        System.out.println("la latitude de sa  zone-> "+zo.getLatitude());
        System.out.println("la longitude de sa  zone->"+zo.getLongitude());
    }
}
