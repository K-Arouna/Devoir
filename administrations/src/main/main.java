package main;

import sn.isi.entities.User;
import sn.isi.service.IUser;
import sn.isi.service.IUserImp;

public class main {

    public  static void main(String[] args){

        IUser user = new IUserImp();
        User u = user.saisie();

        user.affricher(u);
    }
}
