
package planning.controller.util;

import planning.controller.util.Jours;
import planning.controller.util.Jour;
import java.util.ArrayList;
import static planning.controller.util.Jour.JEUDI;
import static planning.controller.util.Jour.LUNDI;
import static planning.controller.util.Jour.MARDI;
import static planning.controller.util.Jour.MERCREDI;
import static planning.controller.util.Jour.VENDREDI;


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
