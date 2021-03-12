package sn.isi.dao;

import sn.isi.entities.User;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class IUserImpl implements IUser{
    private DB db= new DB();
    private ResultSet rs;
    private int ok;
    @Override
    public int add(User u) {
        String sql= "INSERT INTO user VALUE(NULL, ?, ?, ?, ?)";
        try {
            db.initPrepar(sql);
            db.getPstm().setString(1, u.getNom());
            db.getPstm().setString(2, u.getPrenom());
            db.getPstm().setString(3, u.getEmail());
            db.getPstm().setString(4, u.getPassword());

            ok = db.executeMaj();
            db.closeConnection();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<User> liste() {
        List<User> users = new ArrayList<User>();
        String sql= "SELECT * FROM user";
        try {
            db.initPrepar(sql);
            rs = db.executeSelect();
            while (rs.next()){
                User u= new User();
                u.setId(rs.getInt(1));
                u.setNom(rs.getString(2));
                u.setPrenom(rs.getString(3));
                u.setEmail(rs.getString(4));
                u.setPassword(rs.getString(5));

                users.add(u);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return users;
    }

    @Override
    public int update(User u) {
        String sql= "UPDATE user SET nom = ?, prenom = ? WHERE id = ?";
        try {
            db.initPrepar(sql);
            db.getPstm().setString(1, u.getNom());
            db.getPstm().setString(1, u.getPrenom());
            db.getPstm().setInt(2, u.getId());

            ok = db.executeMaj();
            db.closeConnection();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }
}

