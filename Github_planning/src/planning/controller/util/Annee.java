package planning.controller.util;

import java.util.ArrayList;
import java.util.Observable;

public class Annee extends Observable {

    private int annee;
    ArrayList<Mois> listeMois = new ArrayList<>();
    private int nbJours;
    ArrayList<Integer> listeNbJours = new ArrayList<>();
    ArrayList<Date> janvier = new ArrayList<>();
    ArrayList<Date> fevrier = new ArrayList<>();
    ArrayList<Date> mars = new ArrayList<>();
    ArrayList<Date> avril = new ArrayList<>();
    ArrayList<Date> mai = new ArrayList<>();
    ArrayList<Date> juin = new ArrayList<>();
    ArrayList<Date> juillet = new ArrayList<>();
    ArrayList<Date> aout = new ArrayList<>();
    ArrayList<Date> septembre = new ArrayList<>();
    ArrayList<Date> octobre = new ArrayList<>();
    ArrayList<Date> novembre = new ArrayList<>();
    ArrayList<Date> decembre = new ArrayList<>();
    public ArrayList<Date> semaine = new ArrayList<>();
    public String jour = new String();
    public String mois = new String();
    public int numjour;

    public Annee(int annee) {
        this.annee = annee;
        nbJours = 0;
        //Controlleur ctrl = new PlanningController(this);
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

    public String affichagesemaine(int mois, int semaine) {
        /**
         * le premier int i permet de selectionner le mois dans l'array list Le
         * second selectionne la semaine dans le mois precedemment selectionner
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

    public void DateMois(int i, int j) {
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

        switch (i) {

            case 1:
                System.out.println("Janvier");

                for (int a = 1; a <= this.joursMois(Mois.JANVIER); a++) {
                    janv[a] = new Date(a, Mois.JANVIER, this.annee);
                    janv[a].jourAssocie();
                    janv[a].getJour();
                    janv[a].associerJour(a);
                    janvier.add(janv[a]);
                    System.out.println(janv[a].toString());

                }
                System.out.println(this.joursMois(Mois.JANVIER));

                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(janvier.get(k));

                            System.out.println();

                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(janvier.get(k));

                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(janvier.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(janvier.get(k));

                        }
                        break;

                    case 5:
                        for (int k = 28; k < 31; k++) {
                            semaine.add(janvier.get(k));

                        }

                }
                break;

            case 2:
                System.out.println("février");
                for (int a = 1; a <= this.joursMois(Mois.FEVRIER); a++) {
                    fevr[a] = new Date(a, Mois.FEVRIER, this.annee);
                    fevr[a].jourAssocie();
                    fevr[a].getJour();
                    fevrier.add(fevr[a]);
                    System.out.println(fevr[a].toString());

                }
                break;

            case 3:
                for (int a = 1; a <= this.joursMois(Mois.MARS); a++) {
                    marss[a] = new Date(a, Mois.MARS, this.annee);
                    marss[a].jourAssocie();
                    marss[a].getJour();
                    mars.add(marss[a]);
                    System.out.println(marss[a].toString());

                }

                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(mars.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(mars.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(mars.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(mars.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 28; k < 31; k++) {
                            semaine.add(mars.get(k));
                        }
                        break;

                }
                break;

            case 4:
                for (int a = 1; a <= this.joursMois(Mois.AVRIL); a++) {
                    avri[a] = new Date(a, Mois.AVRIL, this.annee);
                    avri[a].jourAssocie();
                    avri[a].getJour();
                    System.out.println(avri[a].toString());
                    avril.add(avri[a]);
                    System.out.println(avri[a].toString());

                }
                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(avril.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(avril.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(avril.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(avril.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 27; k < 30; k++) {
                            semaine.add(avril.get(k));
                        }
                        break;

                }
                break;

            case 5:
                for (int a = 1; a <= this.joursMois(Mois.MAI); a++) {
                    mais[a] = new Date(a, Mois.MAI, this.annee);
                    mais[a].jourAssocie();
                    mais[a].getJour();
                    mai.add(mais[a]);
                    System.out.println(mais[a].toString());

                }
                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(mai.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(mai.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(mai.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(mai.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 27; k < 31; k++) {
                            semaine.add(mai.get(k));
                        }
                        break;

                }
                break;

            case 6:
                for (int a = 1; a <= this.joursMois(Mois.JUIN); a++) {
                    juinn[a] = new Date(a, Mois.JUIN, this.annee);
                    juinn[a].jourAssocie();
                    juinn[a].getJour();
                    juin.add(juinn[a]);
                    System.out.println(juinn[a].toString());

                }

                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(juin.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(juin.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(juin.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(juin.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 27; k < 30; k++) {
                            semaine.add(juin.get(k));
                        }
                        break;

                }
                break;

            case 7:
                for (int a = 1; a <= this.joursMois(Mois.JUILLET); a++) {
                    juil[a] = new Date(a, Mois.JUILLET, this.annee);
                    juil[a].jourAssocie();
                    juil[a].getJour();
                    juillet.add(juil[a]);
                    System.out.println(juil[a].toString());

                }

                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(juillet.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(juillet.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(juillet.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(juillet.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 27; k < 31; k++) {
                            semaine.add(juillet.get(k));
                        }
                        break;

                }
                break;

            case 8:
                for (int a = 1; a <= this.joursMois(Mois.AOUT); a++) {
                    aoutt[a] = new Date(a, Mois.AOUT, this.annee);
                    aoutt[a].jourAssocie();
                    aoutt[a].getJour();
                    aout.add(aoutt[a]);
                    System.out.println(aoutt[a].toString());

                }

                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(aout.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(aout.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(aout.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(aout.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 27; k < 31; k++) {
                            semaine.add(aout.get(k));
                        }
                        break;

                }
                break;

            case 9:
                for (int a = 1; a <= this.joursMois(Mois.SEPTEMBRE); a++) {
                    semp[a] = new Date(a, Mois.SEPTEMBRE, this.annee);
                    semp[a].jourAssocie();
                    semp[a].getJour();
                    septembre.add(semp[a]);
                    System.out.println(semp[a].toString());

                }
                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(septembre.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(septembre.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(septembre.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(septembre.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 28; k < 30; k++) {
                            semaine.add(septembre.get(k));
                        }
                        break;

                }
                break;

            case 10:
                for (int a = 1; a <= this.joursMois(Mois.OCTOBRE); a++) {
                    octo[a] = new Date(a, Mois.OCTOBRE, this.annee);
                    octo[a].jourAssocie();
                    octo[a].getJour();
                    octobre.add(octo[a]);
                    System.out.println(octo[a].toString());

                }
                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(octobre.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(octobre.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(octobre.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(octobre.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 28; k < 31; k++) {
                            semaine.add(octobre.get(k));
                        }
                        break;

                }
                break;

            case 11:
                for (int a = 1; a <= this.joursMois(Mois.NOVEMBRE); a++) {
                    nove[a] = new Date(a, Mois.NOVEMBRE, this.annee);
                    nove[a].jourAssocie();
                    nove[a].getJour();
                    novembre.add(nove[a]);
                    System.out.println(nove[a].toString());

                }
                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(novembre.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(novembre.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(novembre.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(novembre.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 28; k < 30; k++) {
                            semaine.add(novembre.get(k));
                        }
                        break;

                }
                break;

            case 12:
                for (int a = 1; a <= this.joursMois(Mois.DECEMBRE); a++) {
                    dece[a] = new Date(a, Mois.DECEMBRE, this.annee);
                    dece[a].jourAssocie();
                    dece[a].getJour();
                    decembre.add(dece[a]);

                }
                switch (j) {

                    case 1:
                        for (int k = 0; k <= 6; k++) {
                            semaine.add(decembre.get(k));
                        }
                        break;

                    case 2:
                        for (int k = 7; k <= 13; k++) {
                            semaine.add(decembre.get(k));
                        }
                        break;

                    case 3:
                        for (int k = 14; k <= 20; k++) {
                            semaine.add(decembre.get(k));
                        }
                        break;

                    case 4:
                        for (int k = 21; k <= 27; k++) {
                            semaine.add(decembre.get(k));
                        }
                        break;

                    case 5:
                        for (int k = 28; k < 31; k++) {
                            semaine.add(decembre.get(k));
                        }
                        break;

                }
                break;

        }

        setChanged();
        notifyObservers();

    }

    public void a() {

        for (int v = 0; v <= semaine.size(); v++) {
            jour = semaine.get(v).getJour().name();
            System.out.println(jour);
        }

    }

    public String b(int i) {
        mois = semaine.get(i).getMois().name();
        System.out.println(mois);
        return mois;

    }

    public int c(int i) {
        numjour = semaine.get(i).getNumeroJour();
        System.out.println(numjour);
        return numjour;

        //return semaine.get(i).getNumeroJour();
    }

    public void test(int i) {

        System.out.println("on rentre dans le test");
        System.out.println(semaine.get(i).getNumeroJour());
    }

}
