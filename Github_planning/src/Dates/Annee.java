/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dates;

import Dates.Mois;
import EmploiDuTemps.Tab;
import controlleur.Controlleur;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Christine
 */
public class Annee extends Observable{

    private int annee;
    ArrayList<Mois> listeMois = new ArrayList<Mois>();
    private int nbJours;
    ArrayList<Integer> listeNbJours = new ArrayList<Integer>();
    ArrayList<Date> janvier = new  ArrayList<Date>();
    ArrayList<Date> fevrier = new  ArrayList<Date>();
    ArrayList<Date> mars = new  ArrayList<Date>();
    ArrayList<Date> avril = new  ArrayList<Date>();
    ArrayList<Date> mai = new  ArrayList<Date>();
    ArrayList<Date> juin = new  ArrayList<Date>();
    ArrayList<Date> juillet = new  ArrayList<Date>();
    ArrayList<Date> aout = new  ArrayList<Date>();
    ArrayList<Date> septembre = new  ArrayList<Date>();
    ArrayList<Date> octobre = new  ArrayList<Date>();
    ArrayList<Date> novembre = new  ArrayList<Date>();
    ArrayList<Date> decembre = new  ArrayList<Date>();
    ArrayList<Date> semaine = new  ArrayList<Date>();
    

    public Annee(int annee) {
        this.annee = annee;
        nbJours=0;
        //Controlleur ctrl = new Controlleur(this);
        //Tab fouad = new Tab(this);
        //fouad.setVisible(true);
        initMois();
    }

    public void initMois() {
        listeGetMois();//ajouter les mois a l'année

        listeDesJours();//ajouter les jour au mois
        //afficherMois();
       // afficherJours();
        for (int i = 0; i < this.listeMois.size(); i++) {
            /*    if (this.listeMois.get(i) == Mois.JANVIER || this.listeMois.get(i) == Mois.MARS || this.listeMois.get(i) == Mois.MAI || this.listeMois.get(i) == Mois.JUILLET
             || this.listeMois.get(i) == Mois.AOUT || this.listeMois.get(i) == Mois.OCTOBRE || this.listeMois.get(i) == Mois.DECEMBRE) {
             this.nbJours = 31;
             } else if (this.listeMois.get(i) == Mois.AVRIL || this.listeMois.get(i) == Mois.JUIN || this.listeMois.get(i) == Mois.SEPTEMBRE || this.listeMois.get(i) == Mois.NOVEMBRE) {
             this.nbJours = 30;
             } else if (this.listeMois.get(i) == Mois.FEVRIER) {
             //test année bissextile
             if (((annee % 100 != 0) && (annee % 4 == 0))) {
             this.nbJours = 29;
             } else {
             this.nbJours = 28;
             }

             }*/
            //ajout du mois avec son nombre de jours dans la map

        }

    }
    public ArrayList<Mois> getListeMois() {
        return this.listeMois;
    }

    public void setListeMois(ArrayList<Mois> listeMois) {
        this.listeMois = listeMois;
    }
    
    public String affichagesemaine(int i, int j) {
        /**le premier int i permet de selectionner le moi dans l'array list
         * Le second selectionne la semaine dans le mois precedemment selectionner
         */
        return null;
        
    }


    public ArrayList<Integer> getListeNbJours() {
        return this.listeNbJours;
    }

    public void setListeNbJours(ArrayList<Integer> listeNbJours) {
        this.listeNbJours = listeNbJours;
    }
    // 
    public ArrayList<Integer> listeDesJours() {
        for (int i = 0; i < this.listeMois.size(); i++) {
            if (this.listeMois.get(i) == Mois.JANVIER || this.listeMois.get(i) == Mois.MARS || this.listeMois.get(i) == Mois.MAI || this.listeMois.get(i) == Mois.JUILLET
                    || this.listeMois.get(i) == Mois.AOUT || this.listeMois.get(i) == Mois.OCTOBRE || this.listeMois.get(i) == Mois.DECEMBRE) {
                this.nbJours = 31;
                this.listeNbJours.add(this.nbJours);

            } else if (this.listeMois.get(i) == Mois.AVRIL || this.listeMois.get(i) == Mois.JUIN || this.listeMois.get(i) == Mois.SEPTEMBRE || this.listeMois.get(i) == Mois.NOVEMBRE) {
                this.nbJours = 30;
                this.listeNbJours.add(this.nbJours);

            } else if (this.listeMois.get(i) == Mois.FEVRIER) {
                //test année bissextile
                if (((annee % 100 != 0) && (annee % 4 == 0))) {
                    this.nbJours = 29;
                } else {
                    this.nbJours = 28;
                }
                this.listeNbJours.add(this.nbJours);

            }
        }

        return this.listeNbJours;
    }

    public ArrayList<Mois> listeGetMois() {
        Mois[] mois = new Mois[]{Mois.JANVIER, Mois.FEVRIER, Mois.MARS, Mois.AVRIL, Mois.MAI, Mois.JUIN, Mois.JUILLET, Mois.AOUT, Mois.SEPTEMBRE, Mois.OCTOBRE, Mois.NOVEMBRE, Mois.DECEMBRE};
        for (int i = 0; i < mois.length; i++) {
            this.listeMois.add(mois[i]);
        }

        return this.listeMois;
    }

    public void afficherMois() {
        for (int i = 0; i < this.listeMois.size(); i++) {
            System.out.println(this.listeMois.get(i));
        }
    }

    public void afficherJours() {
        for (int i = 0; i < this.listeNbJours.size(); i++) {
            System.out.println(this.listeNbJours.get(i));
        }
    }

    public int getAnnee() {
        return this.annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
//retourne tous les mois de l'année

    public ArrayList<Mois> getMois() {
        return this.listeMois;
    }

    public void setMois(ArrayList<Mois> mois) {
        this.listeMois = mois;
    }

    public int getNbJours() {
        return this.nbJours;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    //renvoie le nombre de jours du mois
    public int joursMois(Mois mois) {
        int nbJours = 0;
        for (int i = 0; i < this.listeMois.size(); i++) {
            if (this.listeMois.get(i) == mois) {
                nbJours = this.listeNbJours.get(i);
                break;
            }

        }
        //System.out.println("Le mois " + mois + " de l'année " + this.annee + " comporte " + nbJours + " jours");
        return nbJours;
    }
//nombre total de jours dans l'année

    public int nbJoursTotal() {
        int nbJoursTotal = 0;
        for (int i = 0; i < this.listeNbJours.size(); i++) {
            nbJoursTotal = this.listeNbJours.get(i) + nbJoursTotal;
        }
        //System.out.println("L'année " + this.annee + " comporte " + nbJoursTotal + " jours");

        return nbJoursTotal;
    }

    public void DateMoi(int i, int j){
        System.out.println("on rentre dans la methode moi ");
       Date[] janv = new Date[32];
       Date[] fevr = new Date[32];
       Date[] marss = new Date[32];
       Date[] avri = new Date[32];
       Date[] mais = new Date[32];
       Date[] juinn = new Date[32];
       Date[] juil = new Date[32];
       Date[] aoutt = new Date[32];
       Date[] semp = new Date[32];
       Date[] octo = new Date[32];
       Date[] nove = new Date[32];
       Date[] dece = new Date[32];
       semaine.clear();
       janvier.clear();
       fevrier.clear();
       mars.clear();
       avril.clear();
       mai.clear();
       juin.clear();
       juillet.clear();
       aout.clear();
       septembre.clear();
       octobre.clear();
       novembre.clear();
       decembre.clear();
                
               
        switch (i)
        {
            
        case 1 :
        System.out.println("Janvier");
                           
        for(int a=1;a<=this.joursMois(Mois.JANVIER);a++){
            janv[a] = new Date(i,Mois.JANVIER,this.annee);
            janv[a].jourAssocie();
            janv[a].getJour();
            janvier.add(janv[a]);
            System.out.println(a);
            System.out.println(janv[a]);
            
            
        }
        System.out.println(this.joursMois(Mois.JANVIER));
                
        
        
        switch(j){
            
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(janvier.get(k));
                            System.out.println(k);
                            
                            
                        }
                        break;
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(janvier.get(k));
                            
                           
                        }
                        break;
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(janvier.get(k));                          
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(janvier.get(k));
                            
                        }break;
                        
                        
                        
                    case 5 :
                        System.out.println("on rentre dans le case 5"); 
                        for(int k = 28 ; k<31; k++){
                        System.out.println("On est dans le for");
                        semaine.add(janvier.get(k));
                        System.out.println(k); 
                    } 
                        break;
        }
        
       
        case 2 : 
            System.out.println("février");
            for(int a=1;a<=this.joursMois(Mois.FEVRIER);a++){
            fevr[a] = new Date(i,Mois.FEVRIER,this.annee);
            fevr[a].jourAssocie();
            fevr[a].getJour();
            System.out.println(fevr[a]);
            fevrier.add(fevr[a]);
        }break;
        
        
        case 3 : 
            System.out.println("mars");
            for(int a=1;a<=this.joursMois(Mois.MARS);a++){
            System.out.println(a);    
            marss[a] = new Date(i,Mois.MARS,this.annee);
            marss[a].jourAssocie();
            marss[a].getJour();
            mars.add(marss[a]);
            
            
        }
        
                switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(mars.get(k));
                        }break;
                        
                        
                    case 2 : 
                        System.out.println("On est dans le 3 de mars raii !");
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(mars.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                        System.out.println("case 3 moi de mars");
                        System.out.println(k);
                            semaine.add(mars.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(mars.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 28 ;k<31; k++){
                            semaine.add(mars.get(k));
                        }break;
                            
                    
                            
                }break;
        
        case 4 : 
            for(int a=1;a<=this.joursMois(Mois.AVRIL);a++){
            avri[a] = new Date(i,Mois.AVRIL,this.annee);
            avri[a].jourAssocie();
            avri[a].getJour();
            System.out.println(avri[a]);
            avril.add(avri[a]);
           
            
        }
         switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(avril.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(avril.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(avril.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(avril.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 27 ;k<30; k++){
                            semaine.add(avril.get(k));
                        }break;
                            
                    
                            
                }break;
        
        case 5 : 
            for(int a=1;a<=this.joursMois(Mois.MAI);a++){
            mais[a] = new Date(i,Mois.MAI,this.annee);
            mais[a].jourAssocie();
            mais[a].getJour();
            mai.add(mais[a]);
            
            
        }
            switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(mai.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(mai.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(mai.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(mai.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 27 ;k<31; k++){
                            semaine.add(mai.get(k));
                        }break;
                            
                    
                            
                }break;
        
                    
                            
                
        
        case 6 : 
            for(int a=1;a<=this.joursMois(Mois.JUIN);a++){
            juinn[a] = new Date(i,Mois.JUIN,this.annee);
            juinn[a].jourAssocie();
            juinn[a].getJour();
            juin.add(juinn[a]);
             
            
        }
            
        switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(juin.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(juin.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(juin.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(juin.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 27 ;k<30; k++){
                            semaine.add(juin.get(k));
                        }break;
                            
                    
                            
                }break;
        
        case 7 : 
            for(int a=1;a<=this.joursMois(Mois.JUILLET);a++){
            juil[a] = new Date(i,Mois.JUILLET,this.annee);
            juil[a].jourAssocie();
            juil[a].getJour();
            juillet.add(juil[a]);
            
            
        }
         
            switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(juillet.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(juillet.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(juillet.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(juillet.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 27 ;k<31; k++){
                            semaine.add(juillet.get(k));
                        }break;
                            
                    
                            
                }break;
        
        case 8 : 
            for(int a=1;a<=this.joursMois(Mois.AOUT);a++){
            aoutt[a] = new Date(i,Mois.AOUT,this.annee);
            aoutt[a].jourAssocie();
            aoutt[a].getJour();
            aout.add(aoutt[a]);
            
             
            
            
        }
                      
                  switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(aout.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(aout.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(aout.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(aout.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 27 ;k<31; k++){
                            semaine.add(aout.get(k));
                        }break;
                            
                    
                            
                }break;
        
        case 9 : 
            for(int a=1;a<=this.joursMois(Mois.SEPTEMBRE);a++){
            semp[a] = new Date(i,Mois.SEPTEMBRE,this.annee);
            semp[a].jourAssocie();
            semp[a].getJour();
            septembre.add(semp[a]);
            
        }
        switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(septembre.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(septembre.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(septembre.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(septembre.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 28 ;k<30; k++){
                            semaine.add(septembre.get(k));
                        }break;
                            
                    
                            
                }break;
        
        
        case 10 : 
            for(int a=1;a<=this.joursMois(Mois.OCTOBRE);a++){
            octo[a] = new Date(i,Mois.OCTOBRE,this.annee);
            octo[a].jourAssocie();
            octo[a].getJour();
            octobre.add(octo[a]);
            
            
        }
        switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(octobre.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(octobre.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(octobre.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(octobre.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 28 ;k<31; k++){
                            semaine.add(octobre.get(k));
                        }break;
                            
                    
                            
                }break;
        
        case 11 : 
            for(int a=1;a<=this.joursMois(Mois.NOVEMBRE);a++){
            nove[a] = new Date(i,Mois.NOVEMBRE,this.annee);
            nove[a].jourAssocie();
            nove[a].getJour();
            novembre.add(nove[a]);
            
        }
        switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(novembre.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(novembre.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(novembre.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(novembre.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 28 ;k<30; k++){
                            semaine.add(novembre.get(k));
                        }break;
                            
                    
                            
                }break;
        
        case 12 : 
            for(int a=1;a<=this.joursMois(Mois.DECEMBRE);a++){
            dece[a] = new Date(i,Mois.DECEMBRE,this.annee);
            dece[a].jourAssocie();
            dece[a].getJour();
            decembre.add(dece[a]);
            
           
        }
         switch(j){
                    
                    case 1 :
                        for(int k = 0 ;k<=6; k++){
                            semaine.add(decembre.get(k));
                        }break;
                        
                        
                    case 2 : 
                        for(int k = 7 ;k<=13; k++){
                            semaine.add(decembre.get(k));
                        }break;
                        
                        
                        
                        
                    case 3 : for(int k = 14 ;k<=20; k++){
                            semaine.add(decembre.get(k));
                        }break;
                    
                        
                        
                    case 4 :for(int k = 21 ;k<=27; k++){
                            semaine.add(decembre.get(k));
                        }break;
                        
                        
                        
                    case 5 : for(int k = 28 ;k<31; k++){
                            semaine.add(decembre.get(k));
                        }break;
                            
                    
                            
                }break;
              
        }

setChanged();
notifyObservers();

    }
    
    public void a(){
        for(int i =0;i<=semaine.size();i++){
            
            
            int jour;
            jour = semaine.get(i).getNumeroJour();
            
         
       }
     
}

    
    
   
}
          
            
            
        



