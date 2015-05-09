/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scolarité;

import scolarité.Formateur;

/**
 *
 * @author Christine
 */
public class Seance {

    private String descriptionSeance;
    private Formateur formateur; //unique formateur

    public Seance(String descriptionSeance) {
        this.descriptionSeance = descriptionSeance;
       // this.formateur = formateur;
    }

    public String getDescriptionSeance() {
        return descriptionSeance;
    }

    public void setDescriptionSeance(String descriptionSeance) {
        this.descriptionSeance = descriptionSeance;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

}
