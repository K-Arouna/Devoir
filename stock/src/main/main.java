package main;

import sn.isi.dao.IProduit;
import sn.isi.dao.IProduitImpl;
import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        IProduit p = new IProduitImpl();
        Produit pro = new Produit();
        User u = new User();
        pro.setRef("1245DRE");
        pro.setNom("sucre");
        u.setId(2);
        List<Produit> prod= new ArrayList<Produit>();
        prod = p.liste();

        pro.setUser(u);
        p.add(pro);
        for (int i = 0; i < prod.size() ; i++) {
            System.out.println("Ref ->"+pro.getRef());
            System.out.println("Nom ->"+pro.getNom());
            System.out.println("userID ->"+pro.getUser().getId());
        }

    }
}
