/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scolarité;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Christine
 */
public class Module {

    private String nom;
    private String abreviation;
    private Color couleur;
    private int dureeHeures;
    private Seances seances;

    public Module(String nom, String abreviation, Color couleur, int dureeHeures, Seances seances) {
        this.nom = nom;
        this.abreviation = abreviation;
        this.couleur = couleur;
        this.dureeHeures = dureeHeures;
        this.seances = seances;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public Color getCouleur() {
        return this.couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getDuree() {
        return this.dureeHeures;
    }

    public void setDuree(int dureeHeures) {
        this.dureeHeures = dureeHeures;
    }

    public Seances getSeances() {
        return this.seances;
    }

    public void setSeances(Seances seances) {
        this.seances = seances;
    }

}
