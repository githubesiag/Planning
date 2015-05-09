/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dates;
import Dates.Jours;
import Dates.Jour;
import static Dates.Jour.DIMANCHE;
import static Dates.Jour.SAMEDI;
import java.util.ArrayList;


/**
 *
 * @author Christine
 */
public class JourNonOuvre extends Jours {

    ArrayList<Jour> joursNonOuvres = new ArrayList<Jour>();

    public JourNonOuvre() {
        super.jours = this.initJoursNonOuvres();
        this.afficherJoursNonOuvres();
    }

    public void afficherJoursNonOuvres() {
        System.out.println("Liste des jours non ouvrés");
        for (int i = 0; i < this.joursNonOuvres.size(); i++) {
            System.out.println(this.joursNonOuvres.get(i));
        }
    }

    public ArrayList<Jour> initJoursNonOuvres() {
        this.joursNonOuvres.add(SAMEDI);
        this.joursNonOuvres.add(DIMANCHE);
        return this.joursNonOuvres;
    }

    public ArrayList<Jour> getJours() {
        return jours;
    }

    public void setJours(ArrayList<Jour> jours) {
        this.jours = jours;
    }
}
