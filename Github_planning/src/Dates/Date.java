package Dates;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pascal
 */
public class Date {

    Mois mois;
    int numeroJour;
    int annee;
    Jour jour;

  

    public Date(int numeroJour, Mois mois, int annee) {
        this.mois = mois;
        this.numeroJour = numeroJour;
        this.annee = annee;
        this.jour=this.jourAssocie();
    }

    public Mois getMois() {
        return mois;
    }

    public void setMois(Mois mois) {
        this.mois = mois;
    }

    public int getNumeroJour() {
        return numeroJour;
    }

    public void setNumeroJour(int numeroJour) {
        this.numeroJour = numeroJour;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Jour jourAssocie() {
        int jour = this.getNumeroJour();
        int mois = associerMois(this.getMois());
        int annee = this.getAnnee();

        int c, a, m, j;

        c = (14 - mois) / 12;
        a = annee - c;
        m = mois + 12 * c - 2;
        j = (jour + a + a / 4 - a / 100 + a / 400 + (31 * m) / 12) % 7;
        return associerJour(j);
    }

    public int associerMois(Mois mois) {
        int unMois = 0;
        if (mois == Mois.JANVIER) {
            unMois = 1;
        } else if (mois == Mois.FEVRIER) {
            unMois = 2;

        } else if (mois == Mois.MARS) {
            unMois = 3;

        } else if (mois == Mois.AVRIL) {
            unMois = 4;

        } else if (mois == Mois.MAI) {
            unMois = 5;

        } else if (mois == Mois.JUIN) {
            unMois = 6;

        } else if (mois == Mois.JUILLET) {
            unMois = 7;

        } else if (mois == Mois.AOUT) {
            unMois = 8;

        } else if (mois == Mois.SEPTEMBRE) {
            unMois = 9;

        } else if (mois == Mois.OCTOBRE) {
            unMois = 10;

        } else if (mois == Mois.NOVEMBRE) {
            unMois = 11;

        } else if (mois == Mois.DECEMBRE) {
            unMois = 12;

        }
        return unMois;
    }
      public Jour getJour() {
        return jour;
    }

    public Jour associerJour(int i) {
        Jour jour = null;
        if (i == 1) {
            jour = Jour.LUNDI;
        } else if (i == 2) {
            jour = Jour.MARDI;

        } else if (i == 3) {
            jour = Jour.MERCREDI;
        } else if (i == 4) {
            jour = Jour.JEUDI;

        } else if (i == 5) {
            jour = Jour.VENDREDI;
        } else if (i == 6) {
            jour = Jour.SAMEDI;
        } else if (i == 0) {
            jour = Jour.DIMANCHE;
        }
        return jour;
    }
}
