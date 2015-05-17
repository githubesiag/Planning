/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import scolarité.Formation;
import java.util.ArrayList;

/**
 *
 * @author Christine
 */
public class Planning {

    ArrayList<Formation> formations = new ArrayList<Formation>();
    ArrayList<Formation> recuperation = new ArrayList<Formation>();

    public Planning(ArrayList<Formation> formations) {
        this.formations = formations;
    }

    public ArrayList<Formation> getFormations() {
        return formations;
    }

    public void setFormations(ArrayList<Formation> formations) {
        this.formations = formations;
    }   
    public void serialiser() throws FileNotFoundException, IOException {
    File file = new File("C://test.txt");
    FileOutputStream fis = new FileOutputStream(file);
    ObjectOutputStream ecr = new ObjectOutputStream(fis);
    ecr.writeObject(this);
    ecr.close();
    
    }
    
    public void deserialiser() throws FileNotFoundException, IOException, ClassNotFoundException {
      //String PATH="C:\\";
      File file = new File("C:\test.txt");
      Planning sauvegarde = new Planning(recuperation);
      FileInputStream fil = new FileInputStream(file);
      ObjectInputStream fal = new ObjectInputStream(fil);
      sauvegarde = (Planning) fal.readObject();
    }
    
    
    
}
