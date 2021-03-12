package sn.isi.service;

import sn.isi.entities.User;

public interface IUser {
    /**
     *
     * @return
     */

    public  User saisie();

    /**
     *
     * @param u
     */
    public  void affricher(User u);

}
