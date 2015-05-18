/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmploiDuTemps;

import Dates.Annee;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import projetihm.Planning;

/**
 *
 * @author Fouad777
 */
public class tableauEmploiDuTempsTest {
    //Planning planning = new Planning(test);
    Planning sauvegarde;
    tableauEmploiDuTemps EmploiDuTemps = new tableauEmploiDuTemps();
    Annee t = new Annee(2015);
    
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
        
    }
    @Test
    public void deserialiser(){
        
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
    
    
}