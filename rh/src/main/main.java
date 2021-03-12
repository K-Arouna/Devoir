package main;

import sn.isi.entities.Consultant;
import sn.isi.entities.Employe;
import sn.isi.service.IConsultant;
import sn.isi.service.IConsultantImpl;
import sn.isi.service.IEmploye;
import sn.isi.service.IEmployeImp;

public class main {

    public static void main(String[] args){
        IConsultant cons= new IConsultantImpl();
        IEmploye emp = new IEmployeImp();
        Employe  e = emp.saisie();
        Consultant c = cons.saisie();

        emp.affiche(e);
        cons.affiche(c);
    }
}
