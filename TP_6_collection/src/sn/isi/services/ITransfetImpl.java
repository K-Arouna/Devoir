package sn.isi.services;

import sn.isi.entities.Transfert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ITransfetImpl implements ITransfert{

    Scanner sc = new Scanner(System.in);
    @Override
    public List<Transfert> list() {
        List<Transfert> t= new ArrayList<Transfert>();
        Transfert tr = new Transfert();
        Date d= new Date();
        System.out.println("Donner l'id du Transfert: ");
        tr.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le libelle: ");
        tr.setLib(sc.nextLine());
        System.out.println("Donner la date: ");
        d.setDate(sc.nextInt());
        tr.setDate(d);
        t.add(tr);
        return t;
    }

    @Override
    public void afficher(List<Transfert> transfert) {
        for (Transfert t: transfert)
        {
            System.out.println("Id ->"+t.getId());
            System.out.println("Libelle ->"+t.getLib());
            System.out.println("Date ->"+t.getDate());
        }

    }
}
