package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.util.List;

public interface IProduit {
    public int add(Produit p);
    public List<Produit> liste();
    public int update(Produit p);
    public int delete(String ref);
}
