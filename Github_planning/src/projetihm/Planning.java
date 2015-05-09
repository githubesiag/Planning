/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import scolarité.Formation;
import java.util.ArrayList;

/**
 *
 * @author Christine
 */
public class Planning {

    ArrayList<Formation> formations = new ArrayList<Formation>();

    public Planning(ArrayList<Formation> formations) {
        this.formations = formations;
    }

    public ArrayList<Formation> getFormations() {
        return formations;
    }

    public void setFormations(ArrayList<Formation> formations) {
        this.formations = formations;
    }

}
