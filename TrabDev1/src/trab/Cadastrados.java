/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import javax.swing.JOptionPane;

/**
 *
 * @author brcar
 */
public class Cadastrados extends javax.swing.JFrame {
    
      medico m = new medico();
      paciente p = new paciente();
      tratamento tm = new tratamento();
    
    private String ValNomem;
    private String ValNomep;
    private String Mnome;
    private String Pnome;
    private String TMnome;
    private String TPnome;
    private Double Mnasci;
    private Double Pnasci;
    private String Espec;
    private String Doenca;

    public void ConsultarM(String Nomem) {
        
        this.ValNomem = Nomem;
        this.Mnome = m.getNome();
        this.TMnome = tm.getNomeTM();
        this.TPnome = tm.getNomeTP();
        
            
        if (ValNomem.equals(Mnome)){
            if(Mnome.equals(TMnome)){
                new FimMediTm().setVisible(true);
              
            
            }else{
                new FimMedi().setVisible(true);
                
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nome inválido.");
        }
          
    }

    public void ConsultarP(String Nomec) {
        
        this.ValNomep = Nomec;
        this.Pnome = p.getNomep();
        this.Pnasci = p.getNasci();
        this.Doenca = p.getDoenc();
        this.TMnome = tm.getNomeTM();
        this.TPnome = tm.getNomeTP();
        
            
        if (ValNomep.equals(Pnome)){
            if(Pnome.equals(TPnome)){
            new FimPacieTm().setVisible(true); 
            }else {
            new FimPacie().setVisible(true);      
            }
        } else {
            JOptionPane.showMessageDialog(null, " Nome inválido.");
        }
          
    }
    /**
     * Creates new form Cadastrados
     */
    public Cadastrados() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Medico = new javax.swing.JCheckBox();
        Paciente = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setText("Consulta de cadastrados");

        jLabel10.setText("Nome :");

        jLabel20.setText("Marque uma das opçoes abaixo :");

        Medico.setText("Medico");
        Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicoActionPerformed(evt);
            }
        });

        Paciente.setText("Paciente");
        Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteActionPerformed(evt);
            }
        });

        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(197, 197, 197)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(jLabel9))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Medico)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Paciente))
                                .addComponent(jLabel20))
                            .addGap(87, 87, 87)))
                    .addContainerGap(81, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jLabel9)
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel20)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Medico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Paciente))
                    .addGap(20, 20, 20)
                    .addComponent(jButton3)
                    .addGap(57, 57, 57)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicoActionPerformed
        // TODO add your handling code here:
        Paciente.setSelected(false);

    }//GEN-LAST:event_MedicoActionPerformed

    private void PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteActionPerformed
        // TODO add your handling code here:
        Medico.setSelected(false);
    }//GEN-LAST:event_PacienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        

        if(Medico.isSelected()){
            ConsultarM(jTextField7.getText());
        }
        if(Paciente.isSelected()){
            ConsultarP(jTextField7.getText());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Medico;
    private javax.swing.JCheckBox Paciente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
