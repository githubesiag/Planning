/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dates;
import Dates.Jours;
import Dates.Jour;
import java.util.ArrayList;
import static Dates.Jour.JEUDI;
import static Dates.Jour.LUNDI;
import static Dates.Jour.MARDI;
import static Dates.Jour.MERCREDI;
import static Dates.Jour.VENDREDI;

/**
 *
 * @author Christine
 */
public class JourOuvre extends Jours {

    ArrayList<Jour> joursOuvres = new ArrayList<Jour>();

    public JourOuvre() {
        super.jours = this.initJourOuvres();
        this.afficherJoursOuvres();
    }

    public void afficherJoursOuvres() {
        System.out.println("Liste des jours ouvrés");
        for (int i = 0; i < this.joursOuvres.size(); i++) {
            System.out.println(this.joursOuvres.get(i));
        }
    }

    public ArrayList<Jour> initJourOuvres() {
        this.joursOuvres.add(LUNDI);
        this.joursOuvres.add(MARDI);
        this.joursOuvres.add(MERCREDI);
        this.joursOuvres.add(JEUDI);
        this.joursOuvres.add(VENDREDI);
        return this.joursOuvres;
    }

    public ArrayList<Jour> getJours() {
        return jours;
    }

    public void setJours(ArrayList<Jour> jours) {
        this.jours = jours;
    }

}
