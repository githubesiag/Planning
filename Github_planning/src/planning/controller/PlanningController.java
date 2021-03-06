package planning.controller;

import planning.controller.util.Annee;
import planning.model.PlanningModel;


public class PlanningController extends javax.swing.JPanel {

    Annee t;
    private final PlanningModel planningModel;

    public PlanningController(PlanningModel planningModel) {
        this.planningModel = planningModel;
        // System.out.println("on rentre dans le constructeur sans parametre CONTROLLEUR");
        initComponents();
    }
   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anneeLabel = new javax.swing.JLabel();
        anneeTextField = new javax.swing.JTextField();
        moisTextField = new javax.swing.JTextField();
        semaineTextField = new javax.swing.JTextField();
        moisLabel = new javax.swing.JLabel();
        semaineLabel = new javax.swing.JLabel();
        confirmerButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Planning Controller", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 13), new java.awt.Color(51, 51, 255))); // NOI18N

        anneeLabel.setText("Année");

        anneeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anneeTextFieldActionPerformed(evt);
            }
        });

        moisLabel.setText("Mois");

        semaineLabel.setText("Semaine");

        confirmerButton.setText("Confirmer");
        confirmerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anneeLabel)
                    .addComponent(moisLabel)
                    .addComponent(semaineLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moisTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(anneeTextField)
                    .addComponent(semaineTextField))
                .addGap(10, 10, 10)
                .addComponent(confirmerButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anneeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anneeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moisLabel)
                    .addComponent(confirmerButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semaineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semaineLabel))
                .addGap(22, 22, 22))
        );

        anneeLabel.getAccessibleContext().setAccessibleName("Année :");
        moisLabel.getAccessibleContext().setAccessibleName("Mois : ");
    }// </editor-fold>//GEN-END:initComponents

    private void anneeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anneeTextFieldActionPerformed


    }//GEN-LAST:event_anneeTextFieldActionPerformed

    private void confirmerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmerButtonActionPerformed
        int a = Integer.parseInt(anneeTextField.getText());
        // System.out.println("REGARDE ICI ON RENTRE DANS LA METHODE RAIIII !");
        int mois;
        mois = Integer.parseInt(moisTextField.getText());
        int semaine = Integer.parseInt(semaineTextField.getText());
        t=new Annee(a);
        //  System.out.println("on affiche l'adresse de l'objet t dans la methode bouton " + t);
        t.DateMois(mois, semaine);
        //il faudrait créer les dates ici ?


    }//GEN-LAST:event_confirmerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anneeLabel;
    private javax.swing.JTextField anneeTextField;
    private javax.swing.JButton confirmerButton;
    private javax.swing.JLabel moisLabel;
    private javax.swing.JTextField moisTextField;
    private javax.swing.JLabel semaineLabel;
    private javax.swing.JTextField semaineTextField;
    // End of variables declaration//GEN-END:variables
}
