/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmploiDuTemps;

import Dates.Annee;
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import org.junit.Assert;
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
    Formation formation=new Formation("ESIAG",t);
    private ArrayList<Module> modules = new ArrayList<Module>();
    
    
    
    public tableauEmploiDuTempsTest() {
    
       
    }

    

    @Test
    public void testMain() {
    }
    
    @Test
    public void serialiser() throws IOException, FileNotFoundException, ClassNotFoundException{
    File file = new File("testunit");
    planning.serialiser(file);
    assertTrue(file.exists());
      
    
    }
    @Test
    public void deserialiser() throws IOException, FileNotFoundException, ClassNotFoundException{
    File file = new File("testUnitaire");
    planning.setFormations(formations);
    planning.serialiser(file);
    sauvegarde.deserialiser(file);
    Assert.assertEquals(planning.getFormations(), sauvegarde.getFormations());
    
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
    
    /**
     *
     */
    @Test
    public void TestConstructeurModule() {
        assertEquals("Math", test.getNom());
        assertEquals("MTH", test.getAbreviation());
        assertEquals(red, test.getCouleur());
        assertEquals(24, test.getDuree(), 0);
        assertEquals(sc, test.getSeances());   
        
        
        
    }


    @Test
    public void modiffModule(){
       /** String Java = new String();
        String Jav = new String();
        Color blue;
        int nbsc = 12;**/
        test.setNom("Java");
        test.setAbreviation("Jav");
        test.setCouleur(blue);
        test.setDuree(12);
        assertEquals("Java", test.getNom());
        assertEquals("Jav", test.getAbreviation());
        assertEquals(blue, test.getCouleur());
        assertEquals(12, test.getDuree(), 0);
        
        
    }
@Test
public void nbheureModule(){
    test.setDuree(28);
    assertEquals(28, test.getDuree(), 1);
}
   @Test
   public void nbheureFormation(){
       
       formation.ajouterModule(modules,test);
       assertEquals(24, formation.dureeTotale(), 1);
   }
   
}
