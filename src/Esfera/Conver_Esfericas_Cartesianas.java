/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esfera;

/**
 *
 * @author SMOUANA
 */
public class Conver_Esfericas_Cartesianas extends javax.swing.JInternalFrame {
        double r = 6371;
    /**
     * Creates new form Esfericas_Cartesianas
     */
    public Conver_Esfericas_Cartesianas() {
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

        jLabel2 = new javax.swing.JLabel();
        lblResultadosX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMinutosLat = new javax.swing.JTextField();
        jGrausLog = new javax.swing.JTextField();
        jSegundosLat = new javax.swing.JTextField();
        jGrausLat = new javax.swing.JTextField();
        jMinutosLog = new javax.swing.JTextField();
        lblResultadosY = new javax.swing.JLabel();
        lblResultadosZ = new javax.swing.JLabel();
        jSegundosLog = new javax.swing.JTextField();
        bCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bApagar = new javax.swing.JButton();

        setTitle("Conversao de Coordenadas");

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel2.setText("Resultados:");

        lblResultadosX.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel4.setText("Latitude");

        jMinutosLat.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jGrausLog.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jSegundosLat.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jGrausLat.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jGrausLat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGrausLatActionPerformed(evt);
            }
        });

        jMinutosLog.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jMinutosLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinutosLogActionPerformed(evt);
            }
        });

        lblResultadosY.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        lblResultadosZ.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jSegundosLog.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        bCalcular.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        bCalcular.setText("Calcular");
        bCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel1.setText("Longitude");

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel3.setText("X");

        jLabel7.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel7.setText("Y");

        jLabel8.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel8.setText("Z");

        jLabel5.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel5.setText("G");

        jLabel6.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel6.setText("M");

        jLabel9.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel9.setText("S");

        jLabel10.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel10.setText("S");

        jLabel11.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel11.setText("M");

        jLabel12.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel12.setText("G");

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
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jGrausLat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jMinutosLat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(lblResultadosY, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultadosZ, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSegundosLog, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(223, 223, 223)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(295, 295, 295)
                            .addComponent(jSegundosLat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblResultadosX, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jGrausLog, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jMinutosLog, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(bCalcular)
                        .addGap(78, 78, 78)
                        .addComponent(bApagar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGrausLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSegundosLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMinutosLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jGrausLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMinutosLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSegundosLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResultadosX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultadosY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultadosZ, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCalcular)
                    .addComponent(bApagar))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGrausLatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGrausLatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGrausLatActionPerformed

    private void jMinutosLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinutosLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMinutosLogActionPerformed

    private void bCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcularActionPerformed
        // Entrada dos Dados 
            double cosLat = Math.cos(Math.PI/180 * (Double.parseDouble(jGrausLat.getText()) 
                         +(Double.parseDouble(jMinutosLat.getText())/60) +
                         (Double.parseDouble(jSegundosLat.getText())/3600)));
                    
            double cosLog = Math.cos(Math.PI/180 * (Double.parseDouble(jGrausLog.getText()) 
                         +(Double.parseDouble(jMinutosLog.getText())/60) +
                         (Double.parseDouble(jSegundosLog.getText())/3600)));
            
            double senLog = Math.sin(Math.PI/180 * (Double.parseDouble(jGrausLog.getText()) 
                         +(Double.parseDouble(jMinutosLog.getText())/60) +
                         (Double.parseDouble(jSegundosLog.getText())/3600)));
            
            double senLat = Math.sin(Math.PI/180 * (Double.parseDouble(jGrausLat.getText()) 
                         +(Double.parseDouble(jMinutosLat.getText())/60) +
                         (Double.parseDouble(jSegundosLat.getText())/3600)));
            
        // Formulas e Resultados 
        
            // Calculo de X   
            double X = r * cosLog * cosLat;
            lblResultadosX.setText(String.valueOf(X));
            
            // Calculo de Y          
            double Y = r * senLog * cosLat;
            lblResultadosY.setText(String.valueOf(Y));
            
            // Calculo de z   
            double Z = r * senLat;
            lblResultadosZ.setText(String.valueOf(Z));
            
    }//GEN-LAST:event_bCalcularActionPerformed

    private void bApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApagarActionPerformed
        this.jGrausLat.setText(null);
        this.jMinutosLat.setText(null);
        this.jSegundosLat.setText(null);
        this.jGrausLog.setText(null);
        this.jMinutosLog.setText(null);
        this.jSegundosLog.setText(null);
        this.lblResultadosX.setText(null);
        this.lblResultadosY.setText(null);
        this.lblResultadosZ.setText(null);
    }//GEN-LAST:event_bApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bApagar;
    private javax.swing.JButton bCalcular;
    private javax.swing.JTextField jGrausLat;
    private javax.swing.JTextField jGrausLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMinutosLat;
    private javax.swing.JTextField jMinutosLog;
    private javax.swing.JTextField jSegundosLat;
    private javax.swing.JTextField jSegundosLog;
    private javax.swing.JLabel lblResultadosX;
    private javax.swing.JLabel lblResultadosY;
    private javax.swing.JLabel lblResultadosZ;
    // End of variables declaration//GEN-END:variables
}