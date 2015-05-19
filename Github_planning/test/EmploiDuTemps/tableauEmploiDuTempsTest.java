/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmploiDuTemps;

import Dates.Annee;
import java.awt.Color;
import static java.awt.Color.red;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import projetihm.Planning;
import scolarité.Formation;
import scolarité.Module;
import scolarité.Seance;
import scolarité.Seances;

/**
 *
 * @author Fouad777
 */
public class tableauEmploiDuTempsTest {
    ArrayList<Formation> formations = new ArrayList<Formation>();
    ArrayList<Formation> recuperation = new ArrayList<Formation>();
    Planning planning = new Planning(formations);
    Planning sauvegarde = new Planning(recuperation);
    tableauEmploiDuTemps EmploiDuTemps = new tableauEmploiDuTemps();
    Annee t = new Annee(2015);
    Annee bis = new Annee(2012);
    private ArrayList<Seance> listeSeances;
    Seances sc = new Seances(listeSeances);
    Module test = new Module("Math","MTH",red,24,sc);
    
    
    
    public tableauEmploiDuTempsTest() {
    
       
    }

    @Test
    public void testSetValueAt() {
    }

    @Test
    public void testMain() {
    }
    
    @Test
    public void serialiser() throws IOException, FileNotFoundException, ClassNotFoundException{
    planning.serialiser();
    sauvegarde.deserialiser();
    assertEquals(planning, sauvegarde);
    
    
    }
    @Test
    public void deserialiser(){
     //commentaire bidon 18/05/2015   
    }
    @Test
    public void tabconf(){
        assertEquals(7, EmploiDuTemps.getColumnCount(),1);
        assertEquals(2,EmploiDuTemps.getRowCount(),1);
       
    }
    
    @Test
    public void jourannée(){
        assertEquals(365, t.nbJoursTotal());
        
    }
    @Test
    public void bisextile(){
        assertEquals(366,bis.nbJoursTotal());
    }
    
   /** @Test
    public Module(String nom, String abreviation, Color couleur, int dureeHeures, Seances seances) {
        this.nom = nom;
        this.abreviation = abreviation;
        this.couleur = couleur;
        this.dureeHeures = dureeHeures;
        this.seances = seances;
    }**/


    @Test
    public void modiffModule(){
        //methode pour modifier les attributs des modules.
    }

    @Test
    public void Module(){
        //constructeur module
    }



}
