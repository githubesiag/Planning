package Dates;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Pascal
 */
public class Calendrier {

    Date date;

    public Calendrier(Date date) {
        this.date = date;
    }

    public void listeDates() {
        Annee annee = new Annee(this.date.getAnnee());
        int nbJours = annee.joursMois(this.date.getMois());
        for (int i = 1; i <= nbJours; i++) {
            this.date.setNumeroJour(i);
            System.out.println(this.date.jourAssocie() + " " + i + " " + this.date.getMois() + " " + this.date.getAnnee());
        }
    }

    public void listeAnnee() {
        Annee annee = new Annee(this.date.getAnnee());
        //annee.initMois();
        for (int i = 0; i < annee.getListeMois().size(); i++) {
            int k = annee.getListeNbJours().get(i); //Nombre de jours dans chaque case (mois)
            for (int m = 1; m <= k; m++) {
                this.date.setNumeroJour(m);
                this.date.setMois(annee.getListeMois().get(i));
                System.out.println(this.date.jourAssocie() + " " + m + " " + annee.getListeMois().get(i) + " " + this.date.getAnnee());

            }

        }
    }

}
