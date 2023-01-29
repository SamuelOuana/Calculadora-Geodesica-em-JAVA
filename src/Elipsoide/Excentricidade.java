/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elipsoide;

import Esfera.*;

/**
 *
 * @author SMOUANA
 */
public class Excentricidade extends javax.swing.JInternalFrame {
     
    double f = 1/298.25;
    /**
     * Creates new form Achatamento_Excentricidade
     */
    public Excentricidade() {
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

        bCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEixo_a = new javax.swing.JTextField();
        lblEixo_b = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jResultados_P_e = new javax.swing.JLabel();
        jResultados_S_e2 = new javax.swing.JLabel();
        bApagar = new javax.swing.JButton();

        setTitle("Excentricidade");

        bCalcular.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        bCalcular.setText("Calcular");
        bCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel1.setText("Excentricidade ( e ) :");

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel2.setText("Excentricidade ( e' ) :");

        lblEixo_a.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lblEixo_a.setText("6378137");

        lblEixo_b.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lblEixo_b.setText("6356752.134");

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel3.setText("Semi-eixo Maior (a)");

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel4.setText("Semi-eixo Menor (b)");

        jResultados_P_e.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jResultados_S_e2.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        bApagar.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        bApagar.setText("Apagar");
        bApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(bCalcular)
                        .addGap(80, 80, 80)
                        .addComponent(bApagar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jResultados_S_e2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jResultados_P_e, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEixo_a, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEixo_b, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEixo_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEixo_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jResultados_P_e, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jResultados_S_e2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCalcular)
                    .addComponent(bApagar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcularActionPerformed
    // Entrada dos valores de "a" e "b"    
        double a = Double.parseDouble(lblEixo_a.getText()); 
        double b = Double.parseDouble(lblEixo_b.getText());
    // Calculo da excentricidade "e" e "e^2"    
        double e = Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2))/ a;
        jResultados_P_e.setText(String.valueOf(e));
        
        double e2 = Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2))/ b;
        jResultados_S_e2.setText(String.valueOf(e2));
        
    }//GEN-LAST:event_bCalcularActionPerformed

    private void bApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApagarActionPerformed
        this.lblEixo_a.setText(null);
        this.lblEixo_b.setText(null);
        this.jResultados_P_e.setText(null);
        this.jResultados_S_e2.setText(null);
    }//GEN-LAST:event_bApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bApagar;
    private javax.swing.JButton bCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jResultados_P_e;
    private javax.swing.JLabel jResultados_S_e2;
    private javax.swing.JTextField lblEixo_a;
    private javax.swing.JTextField lblEixo_b;
    // End of variables declaration//GEN-END:variables
}
