/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elipsoide;

/**
 *
 * @author SMOUANA
 */
public class RaioMedio extends javax.swing.JInternalFrame {

    /**
     * Creates new form RaioMedio
     */
    public RaioMedio() {
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

        jLabel3 = new javax.swing.JLabel();
        lblSemiEixo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblGraus = new javax.swing.JTextField();
        lblMinutos = new javax.swing.JTextField();
        lblSegundos = new javax.swing.JTextField();
        jResultados = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bCalcular = new javax.swing.JButton();
        bApagar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAchatamento = new javax.swing.JTextField();

        setTitle("Raio Medio");

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel3.setText("Raio Medio ( RM ) :");

        lblSemiEixo.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel1.setText("Latitude");

        lblGraus.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lblGraus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblGrausActionPerformed(evt);
            }
        });

        lblMinutos.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lblMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMinutosActionPerformed(evt);
            }
        });

        lblSegundos.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jResultados.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel2.setText("Semi Eixo maior ( a ) :");

        bCalcular.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        bCalcular.setText("Calcular");
        bCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcularActionPerformed(evt);
            }
        });

        bApagar.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        bApagar.setText("Apagar");
        bApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bApagarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel4.setText("G");

        jLabel5.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel5.setText("M");

        jLabel6.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel6.setText("S");

        jLabel7.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel7.setText("Achatamento ( f ) :");

        lblAchatamento.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bCalcular)
                .addGap(105, 105, 105)
                .addComponent(bApagar)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGraus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(66, 66, 66)
                                .addComponent(lblMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(61, 61, 61)
                                .addComponent(lblSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(33, 33, 33)
                                    .addComponent(lblSemiEixo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel3))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAchatamento, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGraus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSemiEixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAchatamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCalcular)
                    .addComponent(bApagar))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGrausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblGrausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGrausActionPerformed

    private void lblMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMinutosActionPerformed

    private void bCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcularActionPerformed
        //
        double a = Double.parseDouble(lblSemiEixo.getText());
        double f = Double.parseDouble(lblAchatamento.getText());
        double e = 2 * f - f*f;
        double latDecimal = (Math.PI/180)*((Double.parseDouble(lblGraus.getText()))
            + (Double.parseDouble(lblMinutos.getText())/60) +
            (Double.parseDouble(lblSegundos.getText())/3600));
        
        double N = a / Math.sqrt(1 - e * Math.sin(Math.pow(latDecimal, 2)));
        double M = a * (1-e) / Math.sqrt(Math.pow(1 - e * Math.sin(Math.pow(latDecimal, 2)), 3));
        double RM = Math.sqrt(N*M);
        jResultados.setText(String.valueOf(RM));
    }//GEN-LAST:event_bCalcularActionPerformed

    private void bApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApagarActionPerformed
        // bOTAO PARA APAGAR OS CAMPOS
        this.lblGraus.setText(null);
        this.lblMinutos.setText(null);
        this.lblSegundos.setText(null);
        this.jResultados.setText(null);
        this.lblSemiEixo.setText(null);
        this.lblAchatamento.setText(null);
    }//GEN-LAST:event_bApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bApagar;
    private javax.swing.JButton bCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jResultados;
    private javax.swing.JTextField lblAchatamento;
    private javax.swing.JTextField lblGraus;
    private javax.swing.JTextField lblMinutos;
    private javax.swing.JTextField lblSegundos;
    private javax.swing.JTextField lblSemiEixo;
    // End of variables declaration//GEN-END:variables
}
