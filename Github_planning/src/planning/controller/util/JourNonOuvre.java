/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planning.controller.util;

import planning.controller.util.Jours;
import planning.controller.util.Jour;
import static planning.controller.util.Jour.DIMANCHE;
import static planning.controller.util.Jour.SAMEDI;
import java.util.ArrayList;


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
