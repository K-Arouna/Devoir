package main;

import sn.isi.entities.Transfert;
import sn.isi.services.ITransfert;
import sn.isi.services.ITransfetImpl;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ITransfert t = new ITransfetImpl();
        List<Transfert> tr = new ArrayList<Transfert>();
        tr = t.list();
        t.afficher(tr);
    }
}
