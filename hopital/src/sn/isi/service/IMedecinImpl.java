package sn.isi.service;

import sn.isi.entities.*;

import java.util.Scanner;

public class IMedecinImpl implements IMedecin{
    private Medecin medecin;
    private Scanner sc = new Scanner(System.in);


    @Override
    public Medecin saisie() {
        medecin = null;
        int rep;
        System.out.println("-----------Quel type de Medecin-----------");
        System.out.println("1-Medecin Generaliste\n " +
                           "2-Medecin Specialiste\n" +
                           "3-Medecin Chef");
        rep= sc.nextInt();
        switch (rep){
            case 1:
                MedecinGeneraliste mg= new MedecinGeneraliste();
                    medecin = mg.saisieMedGen();
                    break;
            case 2:
                MedecinSpecialiste msp = new MedecinSpecialiste();
                medecin = msp.saisieMedSpec();
                     break;
            case 3:
                MedecinChef mch = new MedecinChef();
                medecin = mch.saisieMedChef();
                        break;
            default:
                System.out.println("Choix incorrect!!!!!");
            }
       return medecin;
    }


    @Override
    public void affiche(Medecin m) {
        if (m instanceof MedecinGeneraliste){
            ((MedecinGeneraliste) m).afficheMedGen();
        }else
        if (m instanceof MedecinSpecialiste){
            ((MedecinSpecialiste) m).afficheMedSpe();
        }else
        if(m instanceof MedecinChef) {
            ((MedecinChef) m).afficheMedchef();
        }
    }
}
