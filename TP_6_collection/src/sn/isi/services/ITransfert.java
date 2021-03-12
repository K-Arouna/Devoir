package sn.isi.services;

import sn.isi.entities.Transfert;

import java.util.List;

public interface ITransfert {
    public List<Transfert> list();
    public void afficher(List<Transfert> transfert);
}
