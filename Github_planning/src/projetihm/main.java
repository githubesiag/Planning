/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm;
import Dates.Calendrier;
import Dates.Date;
import Dates.JourNonOuvre;
import Dates.JourOuvre;
import Dates.Mois;
import Dates.Annee;
import EmploiDuTemps.Tab;
import EmploiDuTemps.Tab.Monmodel;
import EmploiDuTemps.tableauEmploiDuTemps;
import controlleur.Controlleur;
import javax.swing.JFrame;
import scolarité.Formation;
/**
 *
 * @author Pascal
 */
public class main {
   
    public static void main(String[] args) {
        /**JourOuvre joursOuvres;
        JourNonOuvre joursNonOuvres;
        Annee uneAnnee = new Annee(2014);
        uneAnnee.joursMois(Mois.AVRIL);
        uneAnnee.nbJoursTotal();
        Formation formation=new Formation("ESIAG",new Annee(2014));
        System.out.print("Date choisie: ");
        Date date=new Date(28,Mois.JANVIER,2014);
        System.out.println ("la date choisie est "+date.getJour()+" "+ date.getNumeroJour()+ " "+date.getMois()+ " "+date.getAnnee() );
        Calendrier calendrier=new Calendrier(date);
        Annee annee=new Annee(date.getAnnee());
                System.out.println("Annee "+annee.getAnnee()+ " choisie comporte "+annee.nbJoursTotal());
        calendrier.listeAnnee();
**/
        
        
        Annee t = new Annee(2015);
        //Tab fouad = new Tab(t);
        //fouad.setVisible(true);
        t.DateMoi(3, 3);
        t.a();
        //t.DateMoi(3, 2);
        //t.a();
       
        
        
        
        /**fr.isCellEditable(1,6);
        fr.isCellEditable(1, 1);
        fr.setVisible(true);
        **/
        //Annee test = new Annee(2014);
        //test.DateMoi(3);
}
}
