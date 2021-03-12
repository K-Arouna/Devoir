package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class IProduitImpl implements IProduit{
    private final DB db= new DB();
    private int ok;
    @Override
    public int add(Produit p) {
        String sql= "INSERT INTO produit VALUES(?, ?, ?)";
        try {
            db.initPrepar(sql);
            db.getPstm().setString(1, p.getRef());
            db.getPstm().setString(2, p.getNom());
            db.getPstm().setInt(3, p.getUser().getId());
            /*db.getPstm().setString(3, p.getUser().getPrenom());
            db.getPstm().setString(3, p.getUser().getEmail());
            db.getPstm().setString(4, p.getUser().getPassword());*/

            ok = db.executeMaj();
            db.closeConnection();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<Produit> liste() {
        List<Produit> produits = new ArrayList<>();
        String sql= "SELECT * FROM produit";
        try {
            db.initPrepar(sql);
            ResultSet rs = db.executeSelect();
            while (rs.next()){
                Produit p= new Produit();
                User u =new User();
                p.setRef(rs.getString(1));
                p.setNom(rs.getString(2));
                u.setNom(rs.getString(3));
                /*u.setPrenom(rs.getString(4));
                u.setEmail(rs.getString(5));
                u.setPassword(rs.getString(6));*/
                p.setUser(u);

                produits.add(p);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return produits;
    }

    @Override
    public int update(Produit p) {
        String sql= "UPDATE produit SET nom = ? WHERE ref = ?";
        try {
            db.initPrepar(sql);


            db.getPstm().setString(1, p.getNom());
            db.getPstm().setString(2, p.getRef());

            ok = db.executeMaj();
            db.closeConnection();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public int delete(String ref){
        Produit p = new Produit();
        String sql = "DELETE FROM produit WHERE ref = ?";
        try {
            db.initPrepar(sql);
            db.getPstm().setString(1, p.getRef() );

            ok = db.executeMaj();
            db.closeConnection();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
}
